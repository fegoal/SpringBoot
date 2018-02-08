/**
 * CommandLineRunner proporciona un interfaz con un metodo run que se ejecutará 
 * antes de lanzar la SpringAppilcation
 */

package com.propia.tuto.springboot.example.application_configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PreRunConfiguration implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("<<<<< PreRunConfiguration:  Esto se ejecuta antes de que se ejecute la aplicación >>>>>");
		
	}

}
