package com.dhasu.Dhasu.controller;


import com.dhasu.Dhasu.model.User;
import com.dhasu.Dhasu.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @CrossOrigin(value="*")
    @PostMapping(value = "/userAdd")
    ResponseEntity<String> user(@RequestBody User user){

        Object data=userRepo.save(user);
        ResponseEntity<String> entity = new ResponseEntity<String>("success", HttpStatus.OK);
        return  entity;
    }

    @CrossOrigin(value="*")
    @GetMapping(value = "/userLogin")
    String data(@RequestParam String email, @RequestParam String password) {

        User fi = userRepo.findByEmail(email);
        if (fi == null) {
            return "Your Email is Wrong !!!";
        } else {
            String e = fi.getEmail();
            String p = fi.getPassword();
            if (e.equals(email) && p.equals(password)) {
                return "Login Success !!!";
            } else {
                return "Your Password is Wrong !!!";
            }
        }
    }


}
