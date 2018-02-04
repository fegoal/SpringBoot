package com.propia.tuto.springboot.example.bean;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class GreatingBean {
	
	public String doGreating(){
		
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow.compareTo(LocalTime.of(12,0,0,0)));
		
		if(timeNow.compareTo(LocalTime.of(12,0,0,0))== 1){
			return "Buenas tardes";
		}
		if(timeNow.compareTo(LocalTime.of(20,0,0,0))< 1){
			return "Buenas noches";
		}
		
		return "No sabes la hora que es?";
	}

}
