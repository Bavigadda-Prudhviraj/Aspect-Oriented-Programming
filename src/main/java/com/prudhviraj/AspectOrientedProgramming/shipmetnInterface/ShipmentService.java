package com.prudhviraj.AspectOrientedProgramming.shipmetnInterface;

public interface ShipmentService {
    String orderPackage(Long orderId);
    String trackPackage(Long orderId);

}
