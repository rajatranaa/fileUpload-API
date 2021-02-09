package com.fileUpload.controller;


import com.fileUpload.payload.FileUploadResponse;
import com.fileUpload.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


/**
 * @author Rajat_rana
 *
 */
@RestController
public class FileController {


    @Autowired
    private FileStorageService fileStorageService;

    // method to save uploaded file in SYSTEM/PC
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public FileUploadResponse uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = fileStorageService.storeFile(file);

        System.out.println("==========Inside Controller============");
        
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        
        FileUploadResponse resp = new FileUploadResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        
        System.out.println("UploadFileResponse obj = " +resp);
        
        return resp;
    }
}
