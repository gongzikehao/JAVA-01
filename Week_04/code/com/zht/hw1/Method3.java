package com.zht.hw1;

import java.util.concurrent.*;

public class Method3 {
    /**
     * desc：使用future的get方法，阻塞主线程，拿到线程池线程的知性结果。
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws TimeoutException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        long start = System.currentTimeMillis();
        final Integer[] result = {-1};
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Future<Integer[]> future = pool.submit(new Callable<Integer[]>() {
            @Override
            public Integer[] call() throws Exception {
                result[0] = fibo(5);
                return result;
            }
        });
        System.out.println("result=" + future.get()[0]);
        System.out.println("use time: " + (System.currentTimeMillis() - start) + " ms");
    }

    public static int fibo(int num) {
        if (num < 3)
            return 1;
        else
            return fibo(num - 1) + fibo(num - 2);
    }
}
