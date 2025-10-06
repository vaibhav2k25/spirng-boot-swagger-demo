package dev.scorpio.swaggerdemo.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "User data transfer object")
public class UserDto {

    @Schema(description = "Unquie id of the user", example = "101")
    private Long id;
    @Schema(description = "User's full name", example = "John Doe")
    private String name;
    @Schema(description = "User's email address", example = "john.doe@example.com")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
