package com.zht.filter;

import io.netty.handler.codec.http.FullHttpResponse;

public class MyHttpResFilter {

    public static void doFilter(FullHttpResponse res) {
        res.headers().set("position","in response filter");
    }

}
