package com.propia.tuto.springboot.example;

/**
 * @SpringBootApplication incluye las isguientes anotaciones @Configuration @EnableAutoConfiguration @ComponentScan
 * @Configuration: Clase de configuracion.
 * @EnableAutoconfiguration: Habilita la autoconfiguracio de Spring, esto es, SpringBoot intentará configurar las aplicación basándose en 
 * las dependencias del pom.xml
 * @ComponentScan: A partir del path donde esta definida buscara todos los beans (@Component, @Service, @Repository, @Controller etc.) 
 *  y los registrara en el contexto.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}
}
