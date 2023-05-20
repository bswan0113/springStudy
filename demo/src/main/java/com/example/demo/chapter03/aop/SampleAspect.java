package com.example.demo.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class SampleAspect {

    @Before("execution(* com.example.demo.chapter03.used.*Greeting.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("--before--");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
        System.out.printf("method:%s%n",joinPoint.getSignature().getName());
    }
    @After("execution(* com.example.demo.chapter03.used.*Greeting.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("--after--");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
        System.out.printf("method:%s%n",joinPoint.getSignature().getName());
    }

    @Around("execution(* com.example.demo.chapter03.used.*Greeting.*(..))")
    public Object arroundAdvice(ProceedingJoinPoint join)throws Throwable{
        System.out.println("around");
        System.out.println("before-around");
        Object res = join.proceed();
        System.out.println("after-around");
        return res;
    }

}
