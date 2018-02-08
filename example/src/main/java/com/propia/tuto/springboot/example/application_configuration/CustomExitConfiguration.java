package com.propia.tuto.springboot.example.application_configuration;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class CustomExitConfiguration implements ExitCodeGenerator {

	@Override
	public int getExitCode() {
		System.out.println("<<<<<< PosRunConfiguration:  Saliendo con código 45 >>>>>>>");
		return 45;
	}

}
