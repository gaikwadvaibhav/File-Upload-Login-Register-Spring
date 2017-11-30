package com.dhasu.Dhasu.controller;

import com.dhasu.Dhasu.model.AddProperty;
import com.dhasu.Dhasu.repo.AddPropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raj on 19/11/17.
 */
@RestController
public class AddPropertyController {

    @Autowired
    AddPropertyRepo addPropertyRepo;

    @CrossOrigin(value = "*")
    @PostMapping("/addproperty")
    ResponseEntity<String> addproperty(@RequestBody AddProperty addProperty){
        Object data= addPropertyRepo.save(addProperty);

        ResponseEntity<String> entity= new ResponseEntity<String>("Success", HttpStatus.OK);
        return entity;
    }
}
