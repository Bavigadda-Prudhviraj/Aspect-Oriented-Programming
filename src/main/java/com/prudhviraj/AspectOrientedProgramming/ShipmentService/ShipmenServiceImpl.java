package com.prudhviraj.AspectOrientedProgramming.ShipmentService;

import com.prudhviraj.AspectOrientedProgramming.shipmetnInterface.ShipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShipmenServiceImpl implements ShipmentService {
    @Override
    public String orderPackage(Long orderId) {
        log.info(("orderPackage is called here....."));
        try {
            log.info("Order is processing");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            log.error("Error occurred while order is processing");
        }
        return "Order is processed successfully with given order ID :" + orderId;
    }

    @Override
    public String trackPackage(Long orderId) {
        log.info(("tackPackage is called here....."));
        try {
            log.info("tacking is  processing here ");
            Thread.sleep(1000);
            throw  new RuntimeException("Runtime exception occurred while tracking the order");
        } catch (InterruptedException e) {
         throw  new RuntimeException(e.getMessage());
        }
    }
}
