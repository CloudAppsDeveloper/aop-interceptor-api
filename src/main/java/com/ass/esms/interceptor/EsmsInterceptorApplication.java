package com.ass.esms.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableJdbcHttpSession
@EnableEurekaClient
@ServletComponentScan
public class EsmsInterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsmsInterceptorApplication.class, args);
	}

}
