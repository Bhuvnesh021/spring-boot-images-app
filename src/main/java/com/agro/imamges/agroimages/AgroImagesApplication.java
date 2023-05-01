package com.agro.imamges.agroimages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.agro.imamges.agroimages")
public class AgroImagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroImagesApplication.class, args);
	}

}
