package dev.scorpio.swaggerdemo.controller;

import dev.scorpio.swaggerdemo.dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Greet the user", description = "Returns a simple greet message",tags = {"Greet Management"})
    public String sayHello() {
        return "Hello from swagger ui";
    }

    @GetMapping("/hello/{name}")
    @Operation(summary = "Greet the user with his name", description = "Return a simple greet message with provided user name",tags = {"Greet Management"})
    public String sayHelloUser(@Parameter(description = "name of the user to greet", required = true, example = "Vaibhav") @PathVariable String name) {
        return "Hello " + name + " from swagger ui";
    }

    @PostMapping()
    @Operation(summary = "Create a new user",tags = {"User Management"})
    public String createUser(@RequestBody UserDto user) {
        return "Created user " + user.getName();
    }
}
