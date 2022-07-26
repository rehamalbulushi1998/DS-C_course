package com.example.demo.controllers;
import com.example.demo.service.S3Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.UUID; 

import static java.net.HttpURLConnection.HTTP_OK;


@RestController
public class S3Contoller {


    @Autowired
    private S3Service s3Service;;

    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file){
       return s3Service.saveFile(file);
    }



    @GetMapping("list")
    public List<String> getAllFiles(){

        return s3Service.listAllFiles();

    }
}