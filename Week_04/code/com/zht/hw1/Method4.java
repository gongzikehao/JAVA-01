package com.zht.hw1;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Method4 {

    private static Lock lock = new ReentrantLock();
    private static Condition c1 = lock.newCondition();

    /**
     * desc：使用Condition的await方法阻塞主线程，在t1线程中调用Condition的signal方法释放主线程
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
                lock.lock();
                result[0] = fibo(5);
                c1.signal();
                lock.unlock();
            }
        });
        t1.start();
        lock.lock();
        c1.await();
        lock.unlock();
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
