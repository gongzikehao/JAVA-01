package com.zht.nio2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.epoll.EpollChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class NettyDemo {

    public static void main(String[] args) {
        //暴露的端口
        int port = 8804;
        //老板一组， 工人一组
        NioEventLoopGroup bossGroup = new NioEventLoopGroup(2);
        NioEventLoopGroup workerGroup = new NioEventLoopGroup(16);
        try {
            //服务启动器
            ServerBootstrap bootStrap = new ServerBootstrap();
            //启动器设置一些启动参数
            bootStrap.option(ChannelOption.SO_BACKLOG, 128)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .option(ChannelOption.SO_KEEPALIVE, true)
                    .option(ChannelOption.SO_REUSEADDR, true)
                    .option(ChannelOption.SO_RCVBUF, 32 * 1024)
                    .option(ChannelOption.SO_SNDBUF, 32 * 1024)
                    .option(EpollChannelOption.SO_REUSEPORT, true)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
            //启动器分组，老板组和工人组在一起
            bootStrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new HttpInitializer());
            //启动器绑定端口，设为异步，接通管道
            Channel ch = bootStrap.bind(port)
                    .sync()
                    .channel();
            System.out.println("开启了Netty Http服务器，监听地址为localhost:" + port + "/");
            //这步不知道是干啥呢？？？
            ch.closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关流，要关就关最外层
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

}
