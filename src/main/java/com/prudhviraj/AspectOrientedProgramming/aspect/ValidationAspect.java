package com.prudhviraj.AspectOrientedProgramming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class ValidationAspect {

    @Pointcut("execution(* com.prudhviraj.AspectOrientedProgramming.ShipmentService.LogginAspectsVersion2.*(..))")
    public void allServiceMethodsPointcut(){}

    @Around("allServiceMethodsPointcut()")
    public Object validationPointcutAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        Object args[] = joinPoint.getArgs();
        Long orderId = (Long) args[0];
        if(orderId > 0){
           return joinPoint.proceed();
        }
        throw new RuntimeException("Order Id cant be less than 0");

    }
}
