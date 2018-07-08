package com.enoch.studio.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Enoch on 2018/4/17.
 */
@Aspect
public class LogAop {

    @Pointcut("execution(* com.enoch.studio.bean.User.login(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before() {
        System.out.println("before");
    }
}
