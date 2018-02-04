package com.propia.tuto.springboot.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.propia.tuto.springboot.example.service.ServiceConstructorInjection;

@RestController
public class SpanishController implements ExampleController {

	private ServiceConstructorInjection serviceGreating;
	
	@Override
	@RequestMapping(path="/")
	public String getGreating() {
		return serviceGreating.greating();
	}
	
	@Autowired	
	public SpanishController(ServiceConstructorInjection serviceGreating){
		this.serviceGreating = serviceGreating;
		
	}
	

}
