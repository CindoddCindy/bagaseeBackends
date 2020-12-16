package com.bagasee.bagaseebackend.securityhandle.message.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignUpForm {

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;


    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min = 3, max = 30)
    private String phone;


    @NotBlank
    @Size(min = 6, max = 100)
    private String password;

    private Set<String> role;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
