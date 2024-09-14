package com.prudhviraj.AspectOrientedProgramming.ShipmentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogginAspectsVersion2 {

    public void allServiceMethodsPointcutTest1(){
        log.info("Test Method 1");
    }

    public void allServiceMethodsPointcutTest2(){
        log.info("Test Method 2");
        throw new RuntimeException("checking after Advice is printing even after exception");
    }

    public String allServiceMethodsPointcutTest3(){
        log.info("Test Method 4");
        return "Returning the String values";
    }

    public Long orderIdValidation(Long id){
        log.info("If id is greater than 0 this log will be gets printed as per validation");
        return id;
    }
}
