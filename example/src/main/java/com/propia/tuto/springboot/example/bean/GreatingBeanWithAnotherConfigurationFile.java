package com.propia.tuto.springboot.example.bean;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 
 * @author felix
 * @PropertySource es la implementación del tag <context:property-placeholder/> de Spring
 */

@Component
@PropertySource({ 
	  "classpath:database.properties"
	})
public class GreatingBeanWithAnotherConfigurationFile {
	
	private static final Logger log = LoggerFactory.getLogger(GreatingBeanWithAnotherConfigurationFile.class);
	
	@Value("${database_name}")
	private String databaseName;
	
	public String doGreating(){
		
		log.info(databaseName);
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
