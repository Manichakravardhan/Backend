package com.webapp.backend;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.webapp.backend.controller.DataController.getData())")
     private void logger(){
         System.out.println("logger invoked before getData()");
     }

    @After("execution(* com.webapp.backend.controller.DataController.returnStatus(..))")
    private void statusLogger(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println("logger invoked before getData()");
    }
}
