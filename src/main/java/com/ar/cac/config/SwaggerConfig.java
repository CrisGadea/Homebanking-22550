package com.ar.cac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

	  /**
     * Para la cabecera del documento generado par openapi / swagger.
     * Datos generales del servidor, desarrolladores, contacto, etc.
     * @return
     */
    @Bean
    public OpenAPI getOpenApiDefinition(){
        return new OpenAPI()
            .info(new Info()
                .title("Open API chuidiang example")
                .version("1.0")
            );
    }
    
}