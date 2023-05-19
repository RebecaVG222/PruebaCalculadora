
/** @author Rebeca Velez*/


package com.prueba.calculadora.servicios;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

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
					
		        	//  LOGGER.error("Operacion Incorrecta: La operacion no es una suma ni una resta ", operacion);
		        	System.out.println("error");		       		
		        	}
				}
			return resultado;
	
	}
}



