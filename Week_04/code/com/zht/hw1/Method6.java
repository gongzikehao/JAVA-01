package com.zht.hw1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;

public class Method6 {

    static CountDownLatch countDownLatch = new CountDownLatch(1);

    /**
     * desc：使用CountDownLatch的await方法阻塞主线程，在t1线程中调用CountDownLatch的countDown方法使计数归零，释放主线程
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws TimeoutException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        long start = System.currentTimeMillis();
        final Integer[] result = {-1};
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                result[0] = fibo(5);
                countDownLatch.countDown();
            }
        });
        t1.start();
        countDownLatch.await();
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
