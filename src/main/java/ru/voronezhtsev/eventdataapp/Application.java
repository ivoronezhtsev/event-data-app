package ru.voronezhtsev.eventdataapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.spi.DocumentationType.OAS_30;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("ru.voronezhtsev.eventdataapp"))
				.paths(PathSelectors.any())
				.build();
	}
}
