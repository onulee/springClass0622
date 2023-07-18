package com.java.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.java.dto.BoardDto;

@Controller
public class FController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/form2")
	public String form2() {
		return "form2";
	}
	
	@RequestMapping("/form3")
	public String form3() {
		return "form3";
	}
	
	@RequestMapping("/doForm2")
	public String doForm2(BoardDto boardDto,List<MultipartFile> files,Model model) 
			throws Exception {
		String fileNames=""; //1개로 합쳐진 파일이름
		String[] arrfileNames = new String[5]; //각각의 파일이름 
		
		String fileName=""; //변경된 이름
		String ori_fileName=""; // 원본파일 이름
		//for(MultipartFile file : files) {
		for(int i=0;i<5;i++) {
			fileName = "";	
			System.out.println((i+1)+" 번째 이미지 업로드 시작!!");
			if(!files.get(i).isEmpty()) { //파일이 존재하면 실행
				//파일저장 소스 start
				ori_fileName = files.get(i).getOriginalFilename();
				//유일한 이름으로 변경
				UUID uuid = UUID.randomUUID();
				fileName = uuid+"_"+ori_fileName;
				String uploadUrl = "c:/upload/";
				File f = new File(uploadUrl+fileName); //임시파일등록
				files.get(i).transferTo(f); //파일저장
			}//if
			
			// 1개로 합쳐진 파일이름
			if(i==0) fileNames += fileName;
			else fileNames += ","+fileName;
			
			arrfileNames[i] = fileName; 
			//파일저장 소스 end
		}
		
		System.out.println("FController fileNames : "+fileNames);   // 1.jpg,2.jpg,3.jpg
		System.out.println("실제 위치값 arrfileNames : "+Arrays.toString(arrfileNames));
		System.out.println("실제 위치값 arrfileNames 개수 : "+arrfileNames.length);
		// 1개파일을 배열로 분리하는 명령어 : String[] arr = fileNames.split(",");
		boardDto.setBfile(fileNames);
		boardDto.setBfiles(arrfileNames);
		
		model.addAttribute("bdto",boardDto);
		
		return "fileCheck2";
	}
	
	
	@RequestMapping("/form1")
	public String form1() {
		return "form1";
	}
	@RequestMapping("/doForm1")
	public String doForm1(BoardDto boardDto,@RequestPart MultipartFile files,
			Model model) throws Exception {
		
		//파일저장 소스 start
		String fileName="";
		if(!files.isEmpty()) {
			String ori_fileName = files.getOriginalFilename();
			UUID uuid = UUID.randomUUID();
			fileName = uuid+"_"+ori_fileName;
			String uploadUrl = "c:/upload/";
			File f = new File(uploadUrl+fileName); //임시파일등록
			files.transferTo(f); //파일저장
		}
		//파일저장 소스 end
		
		System.out.println("FController fileName : "+fileName);
		System.out.println("FController btitle : "+boardDto.getBtitle());
		
		
		model.addAttribute("fileName",fileName);
		model.addAttribute("btitle",boardDto.getBtitle());
		
		
		return "fileCheck";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
