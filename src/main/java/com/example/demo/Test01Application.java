package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @SpringBootApplication  来标注一个主程序类，说明这是一个Spring Boot应用
 */
@Component
@SpringBootApplication
public class Test01Application {

	public static void main(String[] args) {
		//Spring应用启动起来
		SpringApplication.run(Test01Application.class, args);
	}

}
