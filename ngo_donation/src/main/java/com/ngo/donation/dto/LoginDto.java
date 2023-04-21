package com.ngo.donation.dto;

//to create DTO classes to transfer data or payload between client and server and vice-versa.
import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
