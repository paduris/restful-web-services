package com.master.spring.restful.webservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by paduris on 12/17/18.
 * <p>
 * check the below link for more documentation
 * http://localhost:8080/v2/api-docs
 * <p>
 * HTML version
 * http://localhost:8080/swagger-ui.html
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final Contact DEFAULT_CONTACT = new Contact("John Sena", "wwww.google.com", "johnsena@gmail.com");
    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Hello World Title",
            "Hello World Description", "1.0", "", DEFAULT_CONTACT, "Apache 2.0", "www.someurl.com");

    public static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/json", "application/xml"));

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);

    }
}
