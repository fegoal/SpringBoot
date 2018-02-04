package com.propia.tuto.springboot.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propia.tuto.springboot.example.bean.GreatingBean;

@Service
public class ServiceConstructorInjection implements ExampleService{
	
	private final GreatingBean greating;
	
	
	public String greating(){
		return greating.doGreating();
	}
	
	
	@Autowired
	public ServiceConstructorInjection(GreatingBean greating){
		this.greating = greating;
	}

}
