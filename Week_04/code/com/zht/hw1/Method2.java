package com.zht.hw1;

public class Method2 {
    static Object o = new Object();

    /**
     * desc：wait方式，保证主线程先等待，t1线程执行完后notify
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        final int[] result = {-1};
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    result[0] = fibo(5);
                    o.notify();
                }
            }
        });
        t1.start();
        synchronized (o) {
            o.wait();
            System.out.println("result=" + result[0]);
        }
        System.out.println("use time: " + (System.currentTimeMillis() - start) + " ms");
    }

    public static int fibo(int num) {
        if (num < 3)
            return 1;
        else
            return fibo(num - 1) + fibo(num - 2);
    }
}
