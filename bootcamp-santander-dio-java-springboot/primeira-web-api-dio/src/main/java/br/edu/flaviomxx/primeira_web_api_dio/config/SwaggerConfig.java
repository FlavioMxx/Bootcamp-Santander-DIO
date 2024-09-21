package br.edu.flaviomxx.primeira_web_api_dio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")  // Documenta todos os endpoints
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Titulo - API Rest")
                        .version("1.0")
                        .description("API exemplo de uso do Spring Boot API Rest")
                        .termsOfService("Termos de uso: Open Source")
                        .license(new License().name("Licença - Sua Empresa").url("http://site.com.br"))
                        .contact(new Contact()
                                .name("Flavio Milani")
                                .url("http://www.web.com.br")
                                .email("flavio.milani@email.com.br")));
    }
}
