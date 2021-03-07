package com.zht.aspect;

import com.zht.annotation.MyDataSource;
import com.zht.config.DynamicDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class MyServiceAspect implements Ordered {

    @Pointcut("@annotation(com.zht.annotation.MyDataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        MyDataSource ds = method.getAnnotation(MyDataSource.class);
        if (ds == null) {
            DynamicDataSource.set("first");
        } else {
            DynamicDataSource.set(ds.name());
        }

        try {
            return point.proceed();
        } finally {
            DynamicDataSource.remove();
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
