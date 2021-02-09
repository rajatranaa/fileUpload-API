package com.fileUpload.payload;

/**
 * @author Rajat_rana
 *
 */
public class FileUploadResponse {
   private String fileName;
   private String fileUrl; //File location URL will be used for downloading
   private String fileType; //jpeg/MP4 etc
   private long size;

   @Override
public String toString() {
return "FileUploadResponse [fileName=" + fileName + ", fileUrl=" + fileUrl + ", fileType=" + fileType
+ ", size=" + size + "]";
}

//basically used for sending URL back to UI
   public FileUploadResponse(String fileName, String fileUrl, String fileType, long size) {
       this.fileName = fileName;
       this.fileUrl = fileUrl;
       this.fileType = fileType;
       this.size = size;
   }

   public String getFileName() {
       return fileName;
   }

   public void setFileName(String fileName) {
       this.fileName = fileName;
   }

   public String getFileDownloadUri() {
       return fileUrl;
   }

   public void setFileDownloadUri(String fileUrl) {
       this.fileUrl = fileUrl;
   }

   public String getFileType() {
       return fileType;
   }

   public void setFileType(String fileType) {
       this.fileType = fileType;
   }

   public long getSize() {
       return size;
   }

   public void setSize(long size) {
       this.size = size;
   }
}