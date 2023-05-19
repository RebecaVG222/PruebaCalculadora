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

/**Clase CalculadoraController */

@RestController
@RequestMapping("/api")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService service;
	
  //  private TracerImpl t = new TracerImpl();
/**@param num1: primer numero de la operacion
 * @param num2: segundo numero de la operacion
 * @param op: nombre de la operacion (SUMAR o RESTAR)
 * @return  result: resultado de la operacion que devuelve el servicio
 * 
 * Descripcion: Metodo get para optener el resultado de la operacion*/

	@GetMapping(value = "/calculadora")
	public BigDecimal getResultado(@RequestParam(name = "num1") BigDecimal num1,
            @RequestParam(name = "num2") BigDecimal num2,
            @RequestParam(name = "op") String op) throws Exception {
		
		BigDecimal result;
		try {
			result = this.service.getResultado(num1,num2, op);
		}
		catch(Exception e) {
			result = null;
		}	
		return result;
	}		
}

	

