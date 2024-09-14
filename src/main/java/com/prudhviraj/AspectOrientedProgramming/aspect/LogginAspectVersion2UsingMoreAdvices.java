package com.prudhviraj.AspectOrientedProgramming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LogginAspectVersion2UsingMoreAdvices {
    @Before("allServiceMethodsPointcut()")
    public void beforeServicecallsPointcut(JoinPoint joinPoint){
        log.info("Version 2 Aspect beforeServicecallsPointcut() {}", joinPoint.getSignature());

    }

    @After("allServiceMethodsPointcut()")
    public void afterServicecallsPointcut(JoinPoint joinPoint){
        log.info("Version 2 Aspect After Serviceca lls Pointcut() it will execute even there is exception example tes method 2 {}", joinPoint.getSignature());

    }
    @AfterReturning(value = "allServiceMethodsPointcut()", returning = "returningObj")
    public void itWontworkIfExceptionOccurs(JoinPoint joinPoint, Object returningObj){
        log.info("if exception occurs this code wont work not exception this will print {}", joinPoint.getSignature());
        log.info("Returned Object from the method: - {} ",returningObj );

    }

    @AfterThrowing(value = "allServiceMethodsPointcut()")
    public void itwillexecutewhenExceptionIsThere(JoinPoint joinPoint){
        log.info("Exception occurred so this aspect si running {}", joinPoint.getSignature());


    }

    @Pointcut("execution(* com.prudhviraj.AspectOrientedProgramming.ShipmentService.LogginAspectsVersion2.*(..))")
    public void allServiceMethodsPointcut(){}
}
