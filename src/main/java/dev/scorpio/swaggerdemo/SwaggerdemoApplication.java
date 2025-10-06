package dev.scorpio.swaggerdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(title = "MyAPI", version = "1.0", description = "Demo API for learning Swagger with SpringBoot"),
        tags = {
                @Tag(name = "User Management", description = "Operations related to users"),
                @Tag(name = "Greet Management", description = "Operations related to greetings")
        }
)

@SpringBootApplication
public class SwaggerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerdemoApplication.class, args);
    }

}
