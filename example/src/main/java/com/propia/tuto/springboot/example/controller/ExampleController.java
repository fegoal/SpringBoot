package com.propia.tuto.springboot.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.propia.tuto.springboot.example.bean.GreatingBeanWithAnotherConfigurationFile;
import com.propia.tuto.springboot.example.bean.GreatingBeanWithCommandLineConfiguration;
import com.propia.tuto.springboot.example.bean.GreatingBeanWithDefaultConfiguration;
import com.propia.tuto.springboot.example.bean.GreatingBeanWithInjectConfiguration;

@RestController
public class ExampleController {
	
	private static final Logger log = LoggerFactory.getLogger(ExampleController.class);
	
	private GreatingBeanWithDefaultConfiguration 	 greatingBeanWithDefaultConfiguration;
	private GreatingBeanWithAnotherConfigurationFile greatingBeanWithAnotherConfiguration;
	private GreatingBeanWithCommandLineConfiguration greatingBeanWithCommandLineConfiguration;
	private GreatingBeanWithInjectConfiguration 	 greatingBeanWithInjectConfiguration;
	
	@RequestMapping(value = "/saludo", method = RequestMethod.GET)
	public String saluda(){
		
		log.info("Saludo con variables de application.properties");
		greatingBeanWithDefaultConfiguration.doGreating();
		log.info("Saludo con variables de otro fichero de configuración");
		greatingBeanWithAnotherConfiguration.doGreating();
		log.info("Saludo con variables pasadas como argumento");
		greatingBeanWithCommandLineConfiguration.doGreating();
		log.info("Saludo con variables inyectadas en un bean <" + greatingBeanWithInjectConfiguration.getUsername() + ">");
		return "HOLA";
	}
	
	@Autowired
	public void setGreatingBeanWithInjectConfiguration(
			GreatingBeanWithInjectConfiguration greatingBeanWithInjectConfiguration) {
		this.greatingBeanWithInjectConfiguration = greatingBeanWithInjectConfiguration;
	}

	@Autowired
	public void setGreatingBeanWithDefaultConfiguration(
			GreatingBeanWithDefaultConfiguration greatingBeanWithDefaultConfiguration) {
		this.greatingBeanWithDefaultConfiguration = greatingBeanWithDefaultConfiguration;
	}

	@Autowired
	public void setGreatingBeanWithCommandLineConfiguration(
			GreatingBeanWithCommandLineConfiguration greatingBeanWithCommandLineConfiguration) {
		this.greatingBeanWithCommandLineConfiguration = greatingBeanWithCommandLineConfiguration;
	}

	@Autowired
	public void setGreatingBeanWithAnotherConfiguration(
			GreatingBeanWithAnotherConfigurationFile greatingBeanWithAnotherConfiguration) {
		this.greatingBeanWithAnotherConfiguration = greatingBeanWithAnotherConfiguration;
	}

}
