package com.xuan.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三 使用注解方式实现AOP
@Aspect//标注这个类是个切面
public class AnnotationPointCut {
    @Before("execution(* com.xuan.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法3·······方法执行前··········");
    }
    @After("execution(* com.xuan.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法3·······方法执行前··········");
    }
}
