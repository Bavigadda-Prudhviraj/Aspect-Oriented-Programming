package com.prudhviraj.AspectOrientedProgramming.aspect;

import lombok.extern.slf4j.Slf4j;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.prudhviraj.AspectOrientedProgramming.ShipmentService.ShipmenServiceImpl.*(..))")
    public void beforeShippingServiceMethods(JoinPoint joinPoint){
        log.info("this method is called {}", joinPoint.getSignature());
    }
    /*
    What happens when a method in ShipmenServiceImpl is called?
       1. Before any method in the ShipmenServiceImpl class is executed, the aspect will be triggered.
       2. The method beforeShippingServiceMethods will be executed.
       3. Inside this method, the log.info() call will log a message that includes the name of the method being called.

     */
}
