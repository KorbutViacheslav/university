package ua.develop.universitymanagement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "University Management Application",
        version = "0.1",
        description = "Spring Boot RESTful service for university managing."))
public class UniversityManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityManagementApplication.class, args);
    }

}
