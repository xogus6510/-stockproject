package com.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.service.HelloController;

@SpringBootApplication
@ComponentScan //빈으로 등록 될 준비를 마친 클래스들을 스캔하여, 빈으로 등록해주는 것
@ComponentScan(basePackageClasses = HelloController.class)
public class MyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
