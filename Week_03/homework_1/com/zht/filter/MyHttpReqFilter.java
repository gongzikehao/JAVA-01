package com.zht.filter;

import io.netty.handler.codec.http.FullHttpRequest;

public class MyHttpReqFilter {

    public static void doFilter(FullHttpRequest req) {
        req.headers().set("position","in request filter");
    }
}
