package com.dhasu.Dhasu.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    String id;
    String name;
    String optradio;
    @Indexed(unique = true)
    String mobile;
    @Indexed(unique = true,sparse = true)
    String email;
    String password;
    String comfirmpassword;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", optradio='" + optradio + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", comfirmpassword='" + comfirmpassword + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOptradio() {
        return optradio;
    }

    public void setOptradio(String optradio) {
        this.optradio = optradio;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComfirmpassword() {
        return comfirmpassword;
    }

    public void setComfirmpassword(String comfirmpassword) {
        this.comfirmpassword = comfirmpassword;
    }
}