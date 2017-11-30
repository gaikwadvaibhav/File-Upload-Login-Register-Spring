package com.dhasu.Dhasu.controller;

//import com.dhasu.Dhasu.model.File;
import com.dhasu.Dhasu.repo.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by raj on 21/11/17.
 */
@RestController
public class FileUpload {

    @Autowired
    FileRepo fileRepo;

    @CrossOrigin(value = "*")
    @PostMapping(value = "/upload/file")
  public   String upload(@RequestParam("file") MultipartFile file){
    File f = new File("/home/raj/Desktop/xt/"+file.getOriginalFilename());
        try {
            file.transferTo(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "File Uploaded..!!";
    }

}
