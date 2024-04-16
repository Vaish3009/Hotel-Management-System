package com.hotelmanagementsystem.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hotelmanagementsystem.entity.ImageData;
import com.hotelmanagementsystem.repository.ImageRepository;
import com.hotelmanagementsystem.utility.ImageUtils;


@Service
public class ImageService {
	@Autowired
	private ImageRepository imageRepository;
	
	public String uploadImage(MultipartFile file) {
        try {
            String filename = file.getOriginalFilename();
            ImageData imageData = new ImageData();
            imageData.setFilename(filename);
            imageData.setData(file.getBytes());
            imageRepository.save(imageData);
            return "Image saved in DB with the name:"+file.getOriginalFilename();
        } catch (IOException e) {
            e.printStackTrace();
            return "Sorry your image is not saved";
        }
    }
	/*public byte[] downloadImage(String filename){
		Optional<ImageData> imageFromDB=imageRepository.findByName(filename);
		byte[] imageInbytes=ImageUtils.decompressImage(imageFromDB.get().getData());
		return imageInbytes;
	}*/
	
	

}
