package com.prudhviraj.AspectOrientedProgramming;

import com.prudhviraj.AspectOrientedProgramming.ShipmentService.ShipmenServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AspectOrientedProgrammingApplicationTests {
	@Autowired
	ShipmenServiceImpl shimpment;

	@Test
	void contextLoads() {
	}

	@Test
	void aopTestOrderPackage(){
		shimpment.orderPackage(4l);

	}

	@Test
	void aopTesttrackPackage(){
		shimpment.trackPackage(4l);
	}

	@Test
	void aopTest(){
		shimpment.test();
	}

}
