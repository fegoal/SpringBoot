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
 * Por defecto cualquier bean tiene acceso a application.properties del root del classpath
 */

@Component
public class GreatingBeanWithDefaultConfiguration {
	
	private static final Logger log = LoggerFactory.getLogger(GreatingBeanWithDefaultConfiguration.class);
	
	@Value("${spring.datasource.url}")
	private String dataSourceUrl;
	
	public String doGreating(){
		
		log.info(dataSourceUrl);
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
