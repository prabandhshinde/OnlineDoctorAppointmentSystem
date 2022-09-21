package project.model;

import org.springframework.web.multipart.MultipartFile;

import project.Entity.Doctor_info;

public class ImageUpload {
	
	private MultipartFile file;
	private Doctor_info doc;
	
	
	public ImageUpload()
	{
		
	}
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public Doctor_info getDoc() {
		return doc;
	}
	public void setDoc(Doctor_info doc) {
		this.doc = doc;
	}
	
	

}
