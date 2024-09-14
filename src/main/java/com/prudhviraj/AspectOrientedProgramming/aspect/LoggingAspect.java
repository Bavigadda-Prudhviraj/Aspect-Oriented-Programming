package com.prudhviraj.AspectOrientedProgramming.aspect;

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

    //PointCuts
    @After("execution(*  com.prudhviraj.AspectOrientedProgramming.ShipmentService.ShipmenServiceImpl.orderPackage(..))")
    public void pointcutAfterOrderPackageMethod(JoinPoint joinPoint){
        log.info("OrderPackageMethod() Point cut is called after the method call ");

    }
    /*
    pointcutAfterOrderPackageMethod:
        This method is executed after the orderPackage() method in the ShipmenServiceImpl class.
        It logs the message: "OrderPackageMethod() Point cut is called after the method call".
        Use case: Logging or performing post-processing after the orderPackage() method completes.
     */

    @After("within(com.prudhviraj.AspectOrientedProgramming.ShipmentService.*)")
    public void pointcutForPackage(JoinPoint joinPoint) {
        log.info("this is the within key word pointcut for ShipmentService  this ASPECT will trigger");

    }
    /*
    pointcutForPackage:
        This method is executed after any method in any class within the ShipmentService package.
        It logs the message: "this is the within key word pointcut for ShipmentService this ASPECT will trigger".
        Use case: Logging or tracking method executions across all classes in the ShipmentService package.
     */

    @Before("@annotation(org.springframework.transaction.annotation.Transactional)")
    public void annotationBasedAspect(){
        log.info("the @annotation pointcut is used to intercept methods that are annotated with a specific annotation");

    }

    @After("pointcutToUseMultiplePlaces()")
    public void customAnnotationBasedAspect(){
        log.info("Custom annotation point cut");

    }

    @Pointcut("@annotation(com.prudhviraj.AspectOrientedProgramming.customAnnotations.MyLoggingAnnotation)")
    public void pointcutToUseMultiplePlaces(){

    }
}
