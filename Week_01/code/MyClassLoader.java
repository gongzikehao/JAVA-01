package com.zht.homework1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyClassLoader extends ClassLoader {

    public static void main(String[] args) throws Exception {
        Object instance = new MyClassLoader().findClass("Hello").newInstance();
        Method hello = instance.getClass().getDeclaredMethod("hello");
        hello.invoke(instance);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        BufferedInputStream bis = null;
        byte[] allBytes = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("D:/temp_dir/Hello.xlass"));
            byte[] buf = new byte[1024];
            int length = bis.read(buf);
            allBytes = Arrays.copyOf(buf, length);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        System.out.println("原始byte:");
//        for (byte curr : allBytes) {
//            System.out.print(curr + " ");
//        }
//        System.out.println();
        for (int i = 0; i < allBytes.length; i++) {
            allBytes[i] = (byte) (255 - allBytes[i]);
        }
//        System.out.println("255-原始byte:");
//        for (byte curr : allBytes) {
//            System.out.print(curr + " ");
//        }
//        System.out.println();
        Class<?> orginalClazz = defineClass(name, allBytes, 0, allBytes.length);
        return orginalClazz;
    }
}
