package com.zht.router;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyRouter {

    private static final List<String> addrList = new ArrayList<>();
    private static Random r = new Random();

    static {
        addrList.add("http://localhost:8801");
        addrList.add("http://localhost:8802");
        addrList.add("http://localhost:8803");
    }

    public static String doRouter() {
        int idx = r.nextInt(3);
        System.out.println("产生的随机数是：" + idx);
        return addrList.get(idx);
    }

}
