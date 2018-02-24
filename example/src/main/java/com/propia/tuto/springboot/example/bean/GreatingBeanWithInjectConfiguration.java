package com.propia.tuto.springboot.example.bean;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @author felix
 * En esta clase se inyectan los properties de application.properties cuyo prefijo es "spring.datasource"
 * ha de incluirse los getters y los setters correspondientes para que SpringBoot los pueda inyectar.
 */

@Component
@ConfigurationProperties(prefix="spring.datasource")
public class GreatingBeanWithInjectConfiguration {
	
	private static final Logger log = LoggerFactory.getLogger(GreatingBeanWithInjectConfiguration.class);
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
