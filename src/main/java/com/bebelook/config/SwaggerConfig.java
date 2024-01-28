package com.bebelook.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
		title = "bebelook API 정의서",
		version = "v1",
		description = "베베룩 API 정의서"
	)
)
@Configuration
public class SwaggerConfig {
}
