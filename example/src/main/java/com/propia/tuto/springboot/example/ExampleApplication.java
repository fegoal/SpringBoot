package com.propia.tuto.springboot.example;

import org.springframework.beans.factory.annotation.Autowired;

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

import com.propia.tuto.springboot.example.bean.GreatingBeanWithAnotherConfigurationFile;
import com.propia.tuto.springboot.example.bean.GreatingBeanWithDefaultConfiguration;

@SpringBootApplication
public class ExampleApplication {

	@Autowired
	GreatingBeanWithDefaultConfiguration greatingBeanWithDefaultConfiguration;
	@Autowired
	GreatingBeanWithAnotherConfigurationFile greatingBeanWithAnotherConfiguration;

	
	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);

	}
}
