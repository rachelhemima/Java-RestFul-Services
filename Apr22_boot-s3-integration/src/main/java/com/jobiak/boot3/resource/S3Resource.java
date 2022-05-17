package com.jobiak.boot3.resource;

import java.io.FileNotFoundException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jobiak.boot3.service.S3Service;



@RestController
@RequestMapping("/file")

public class S3Resource {
	@Autowired
    private S3Service service;
      @PostMapping ("/upload")
    //rest api can also return response entity,we take it and build response

	 public ResponseEntity<String> uploadFile(@RequestParam(value="file") MultipartFile file) 
			 throws FileNotFoundException{

	return new ResponseEntity<>(service.uploadFile(file), HttpStatus.OK);

	}
      

	
	  @GetMapping("/download/{fileName}")
	  public ResponseEntity<ByteArrayResource>downloadFile(@PathVariable String fileName) {
		  byte[] data =service.downloadFile(fileName);	  
		  ByteArrayResource resource= new ByteArrayResource (data);	  
	      
		  return ResponseEntity .ok() .contentLength(data.length)
	                                  .header("Content-type", "application/octet-stream")
	                                  .header("Content-disposition", "attachment;filename=\""+ fileName +"\"")
	                                  .body (resource);
		  }
	  
	  @DeleteMapping("/delete/{fileName}")
	  
	  public ResponseEntity<String> deletefile( @PathVariable String fileName) {
	  return new ResponseEntity<>(service.deletefile(fileName), HttpStatus.OK); }
	 

}