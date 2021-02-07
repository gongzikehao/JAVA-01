package com.zht.hw1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class Method5 {

    /**
     * desc：使用LockSupport的park方法阻塞主线程，在t1线程中调用LockSupport的unpark方法释放主线程
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws TimeoutException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        long start = System.currentTimeMillis();
        final Integer[] result = {-1};
        Thread mainThread = Thread.currentThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                result[0] = fibo(5);
                LockSupport.unpark(mainThread);
            }
        });
        t1.start();
        LockSupport.park();
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
