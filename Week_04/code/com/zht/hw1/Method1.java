package com.zht.hw1;

public class Method1 {

    /**
     * desc：join方式，保证插队线程先完成
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        final int[] result = {-1};
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                result[0] = fibo(5);
            }
        });
        t1.start();
        t1.join();
        System.out.println("result=" + result[0]);
        System.out.println("use time: " + (System.currentTimeMillis() - start) + " ms");
    }

    public static int fibo(int num) {
        if (num < 3)
            return 1;
        else
            return fibo(num - 1) + fibo(num - 2);
    }
}
