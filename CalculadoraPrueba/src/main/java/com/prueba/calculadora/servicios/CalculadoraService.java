/** @author Rebeca Velez*/


package com.prueba.calculadora.servicios;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**Servicio CalculadoraService: permite calcular las opercacion de SUMAR o RESTAR dos numeros*/

@Service
public class CalculadoraService {
	
	/**
	 * GetResultado: metodo que calcula el resultado de sumar o restar dos numeros BigDecimal
	 * Para mejorar la aplicacion con otras operaciones pueden añadirse como otros "else if" o cambiando el bucle por un switch-case
	 * @param num1: primer numero de la operacion
	 * @param num2: segundo numero de la operacion
	 * @param op: nombre de la operacion (SUMAR o RESTAR)
	 * @return  resultado: resultado de la operacion*/
	@ExceptionHandler 
	public BigDecimal getResultado(BigDecimal num1, BigDecimal num2, String op) {
		BigDecimal resultado= null;
			if (op!=null & !op.equals("")) {
				if (op.equals("SUMAR")) {
					resultado = num1.add(num2); 
		        }
				else if (op.equals("RESTAR")) {
		        	resultado = num1.subtract(num2); 	
		        }		        
				else {
					
					System.out.println("La operacion no es correcta. En esta calculadora solo es posible SUMAR o RESTAR");		       		
					}
				}
			return resultado;
	
	}
}



