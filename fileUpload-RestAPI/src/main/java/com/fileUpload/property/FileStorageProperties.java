package com.fileUpload.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @author Rajat_rana
 *
 */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
