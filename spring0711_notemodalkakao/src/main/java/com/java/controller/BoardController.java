package com.java.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class BoardController {
	
	@GetMapping("/boardWrite")
	public String boardWrite() {
		return "boardWrite";
	}
	
	@GetMapping("/modal")
	public String modal() {
		return "modal";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/uploadSummernoteImageFile")
	@ResponseBody
	public String fileUpload(@RequestPart MultipartFile file) throws Exception {

		String urlName="";
		if (!file.isEmpty()) {
			// 원본파일이름
			String originFileName = file.getOriginalFilename();
			long time = System.currentTimeMillis();
			String uploadFileName = String.format("%d_%s", time, originFileName);
			// 파일 저장 위치
			String fileUrl = "C:/upload/";
			File f = new File(fileUrl + uploadFileName);
		
			file.transferTo(f);
			urlName = "/upload/"+uploadFileName; 
		}
		System.out.println("파일 이름 : "+urlName);
		
		return urlName;
	}

	
	

}
