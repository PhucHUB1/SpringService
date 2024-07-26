package org.example.springsecurewebservicev2.dto.user;


import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserUpdateDto {
    @Size(min = 3,message = "INVALID_USERNAME")
    private String username;
    @Size(min = 8,message = "INVALID_PASSWORD")
    private String password;

}
