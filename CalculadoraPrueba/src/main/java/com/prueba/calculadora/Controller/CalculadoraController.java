
/** @author Rebeca Velez*/

package com.prueba.calculadora.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import io.corp.calculator.TracerImpl;

import com.prueba.calculadora.servicios.CalculadoraService;


@RestController
@RequestMapping("/api")
public class CalculadoraController {

	
	@Autowired
	private CalculadoraService service;
	
  //  private TracerImpl t = new TracerImpl();


	@GetMapping(value = "/calculadora")
	public BigDecimal getResultado(@RequestParam(name = "num1") BigDecimal num1,
            @RequestParam(name = "num2") BigDecimal num2,
            @RequestParam(name = "op") String op) throws Exception {
		
		BigDecimal result = this.service.getResultado(num1,num2, op);

		 return result;
	}
		
}

	

