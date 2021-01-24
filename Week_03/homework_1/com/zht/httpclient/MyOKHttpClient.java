package com.zht.httpclient;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MyOKHttpClient {

    public static String sendGet(String url) {
        try {
            OkHttpClient httpClient = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Response response = httpClient.newCall(request).execute();
            return response.body().string(); // 返回的是string 类型，json的mapper可以直接处理
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "my error msg!!!";
    }
}
