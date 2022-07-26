package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.UUID;   

public interface FileServiceImpl {


    String saveFile(MultipartFile file);

    List<String> listAllFiles();
}