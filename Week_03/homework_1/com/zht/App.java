package com.zht;

import com.zht.httpclient.MyHttpClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        MyHttpClient.sendGet("http://localhost:8804/test");
    }
}
