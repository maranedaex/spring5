package com.bolsadeideasspringbootbackendapirest;

import org.junit.BeforeClass;
import org.testng.annotations.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootBackendApirestApplicationTests {

	@Test
	void contextLoads() {
	}
	 @BeforeClass
	 public void setUp() {
	   // code that will be invoked when this test is instantiated
	 }
	 
	 @Test //(groups = { "fast" })
	 public void aFastTest() {
	   System.out.println("Fast test");
	 }
	 
	 @Test  //(groups = { "slow" })
	 public void aSlowTest() {
	    System.out.println("Slow test");
	 }


}
