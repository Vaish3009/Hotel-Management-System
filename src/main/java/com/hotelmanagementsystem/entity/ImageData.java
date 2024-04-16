package com.hotelmanagementsystem.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="ImageData")

public class ImageData {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String filename;

	    @Lob
	    @Column(name="imageData")
	    private byte[] data;
	    
	    // Constructors, getters, setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFilename() {
			return filename;
		}

		public void setFilename(String filename) {
			this.filename = filename;
		}

		public byte[] getData() {
			return data;
		}

		public void setData(byte[] data) {
			this.data = data;
		}


}
