package com.prudhviraj.AspectOrientedProgramming;

import com.prudhviraj.AspectOrientedProgramming.ShipmentService.LogginAspectsVersion2;
import com.prudhviraj.AspectOrientedProgramming.ShipmentService.ShipmenServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AspectOrientedProgrammingApplicationTests {
	@Autowired
	ShipmenServiceImpl shimpment;

	@Autowired
	LogginAspectsVersion2 version2Advices;

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

	@Test
	void versionTest1(){
		version2Advices.allServiceMethodsPointcutTest1();
	}
	@Test
	void versionTest2(){
		version2Advices.allServiceMethodsPointcutTest2();
	}

	@Test
	void versionTest3(){
		version2Advices.allServiceMethodsPointcutTest3();
	}

	@Test
	void versionTest5(){
		version2Advices.orderIdValidation(0l);
	}

}
