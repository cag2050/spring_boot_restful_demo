package com.cag.spring_boot_restful_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
 public class SpringBootRestfulDemoApplication {
// war 打包，使用下面这行
//public class SpringBootRestfulDemoApplication extends SpringBootServletInitializer {
	// war 打包，使用下面
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringBootRestfulDemoApplication.class);
//	}

	@RequestMapping(value = { "/", "" })
	public String Helloboot() {
		return "Hello Spring boot！";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulDemoApplication.class, args);
	}
}
