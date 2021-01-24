package com.zht.nio2;

import com.zht.filter.MyHttpReqFilter;
import com.zht.filter.MyHttpResFilter;
import com.zht.httpclient.MyHttpClient;
import com.zht.httpclient.MyOKHttpClient;
import com.zht.router.MyRouter;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;
import io.netty.util.ReferenceCountUtil;

public class HttpHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        try {
            FullHttpRequest request = (FullHttpRequest) msg;
            //网关2.0过滤器实现，设置请求的过滤
            MyHttpReqFilter.doFilter(request);
            String uri = request.uri();
            if (uri.contains("/test")) {
                myHandler(request, ctx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    private void myHandler(FullHttpRequest request, ChannelHandlerContext ctx) {
        System.out.println("headerKey position:" + request.headers().get("position"));
        FullHttpResponse response = null;
        try {
            //网关3.0实现，加路由
            String url = MyRouter.doRouter();
            //网关1.0实现
            String value = MyOKHttpClient.sendGet(url);
            response = new DefaultFullHttpResponse(
                    HttpVersion.HTTP_1_1,
                    HttpResponseStatus.OK,
                    Unpooled.wrappedBuffer(value.getBytes("UTF-8"))
            );
            response.headers().set("Content-Type", "application/json");
            response.headers().setInt("Content-Length", response.content().readableBytes());
            //网关2.0过滤器实现，设置响应的过滤
            MyHttpResFilter.doFilter(response);
        } catch (Exception e) {
            System.out.println("自定义打印的出错信息：" + e.getMessage());
            response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NO_CONTENT);
        } finally {
            if (request != null) {
                if (!HttpUtil.isKeepAlive(request)) {
                    ctx.write(response).addListener(ChannelFutureListener.CLOSE);
                } else {
                    response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
                    ctx.write(response);
                }
            }
        }
    }
}
