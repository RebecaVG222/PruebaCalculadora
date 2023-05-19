
/** @author Rebeca Velez*/


package com.prueba.calculadora;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;

import com.prueba.calculadora.servicios.CalculadoraService;


@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class tests {
	
	@Autowired
	CalculadoraService service;
	
	/**Puerto aleatorio*/
	 @LocalServerPort
	 int puerto;

	/**Test 1: SUMAR dos numeros 25+63*/
	@Test
	public void test1() throws InterruptedException,URISyntaxException  {	
		
		RestTemplate template = new RestTemplate();
	    String url = "http://localhost:" + puerto + "/api/calculadora?num1=" + 25 + "&num2=" + 63 + "&op=SUMAR" ;
        URI uri = new URI(url);
        ResponseEntity<BigDecimal> resultado = template.getForEntity(uri, BigDecimal.class);
		assert(resultado != null );
	}
	
	/**Test 2: RESTAR dos numeros 90-35*/
	@Test
	public void test2() throws InterruptedException, URISyntaxException {
			RestTemplate template = new RestTemplate();
			String url = "http://localhost:" + puerto + "/api/calculadora?num1=" + 90 + "&num2=" + 35 + "&op=RESTAR" ;
	        URI uri = new URI(url);
	        ResponseEntity<BigDecimal> resultado = template.getForEntity(uri, BigDecimal.class);
			assert(resultado != null );
			
	}

}
