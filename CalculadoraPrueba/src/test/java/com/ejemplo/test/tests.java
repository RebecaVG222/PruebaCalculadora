
/** @author Rebeca Velez*/


package com.ejemplo.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.calculadora.servicios.CalculadoraService;


@SpringBootTest
public class tests {
	
	@Autowired
	CalculadoraService service;
		
	//Test 1: 
	@Test
	public void test1()  {		
		
	//		assert(result != null && !result.isEmpty());
	}
	
	//Test 2: 
	@Test
	public void test2() throws InterruptedException {
		
	//	assert(result != null && !result.isEmpty());
				
			
	}

}
