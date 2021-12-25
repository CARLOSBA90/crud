package com.cepr.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CrudApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CrudApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
