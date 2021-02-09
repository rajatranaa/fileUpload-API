package com.fileUpload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.fileUpload.property.FileStorageProperties;
/**
 * @author Rajat_rana
 *
 */
@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
		
		System.out.println("=======================Upload-save Rest API started==================");
	}
}