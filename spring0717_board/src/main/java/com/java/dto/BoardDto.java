package com.java.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardDto {

	private int bno;
	private String id;
	private String btitle;
	private String bcontent;
	private Timestamp bdate;
	private int remainDate;
	private int bhit;
	private int bgroup;
	private int bstep;
	private int bindent;
	private String[] bfiles; // list출력할때 사용하는 이름
	private String bfile;  //파일저장이름
	
	
	
	
	
}
