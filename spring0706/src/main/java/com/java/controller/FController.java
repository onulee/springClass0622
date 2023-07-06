package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.dto.IncomeDto;
import com.java.service.IncomeService;

@Controller
public class FController {
	
	@Autowired IncomeService incomeService;
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/chart")
	public String chart() {
		return "chart";
	}
	
	@RequestMapping("/chart_data")
	@ResponseBody
	public ArrayList<IncomeDto> chart_data(int year) {
		System.out.println("년도 : "+year);
		ArrayList<IncomeDto> list = incomeService.selectAll(year); 
		return list;
	}

}
