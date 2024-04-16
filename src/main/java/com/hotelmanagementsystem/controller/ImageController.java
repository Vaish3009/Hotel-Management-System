package com.hotelmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hotelmanagementsystem.entity.ImageData;
import com.hotelmanagementsystem.service.ImageService;

@RestController
@RequestMapping("/images")
public class ImageController {
	@Autowired
    private ImageService imageService;
	@PostMapping
	public ResponseEntity<String> uploadImage(@RequestParam("image") MultipartFile file) {
	    String uploadedImageUrl = imageService.uploadImage(file);
	    return ResponseEntity.ok().body(uploadedImageUrl);
	}
	
	/*@GetMapping("{/filename}")
	public ResponseEntity<byte[]> downloadImage(@PathVariable String filename){
		byte[] imageInBytes=imageService.downloadImage(filename);
		return ResponseEntity.ok().contentType(MediaType.valueOf("image/png")).body(imageInBytes);
	}*/

}
