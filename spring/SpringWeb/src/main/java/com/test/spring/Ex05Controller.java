package com.test.spring;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex05Controller {
	
	@GetMapping(value="/add")
	public String add() {
	
		return "add";
		
	}
	
//	@PostMapping(value="/addok")
//	public String addok(HttpServletRequest req, HttpServletResponse resp) {
//		
//		String num = req.getParameter("num");
//		
//		req.setAttribute("num", num);
//		
//		return "addok";
//	}
	
//	@PostMapping(value="/addok")
//	public String addok(HttpServletRequest req) {
//		
//		//req.setCharacterEncoding("UTF-8");
//		
//		String num = req.getParameter("num");
//		
//		req.setAttribute("num", num);
//		
//		return "addok";
//	}
	
//	@PostMapping(value="/addok")
//	public String addok(@RequestParam("num") String num) {
//		
//		System.out.println(num);
//		
//		return "addok";
//	}
	
	
//	@PostMapping(value="/addok")
//	public String addok(String num, Model model) {
//		
//		//System.out.println(num);
//		
//		model.addAttribute("num", num);
//		
//		return "addok";
//	}
	
	
//	@PostMapping(value="/addok")
////	public String addok(@RequestParam("name") String name,
////						 String age, String address, Model model) {
//	public String addok(String name, String age, String address, Model model) {
//		
////		model.addAttribute("name", name);
////		model.addAttribute("age", age);
////		model.addAttribute("address", address);
//		
//		SpringDTO dto = new SpringDTO();
//		
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
//
//		model.addAttribute("dto", dto);
//		
//		return "addok";
//	}
//	
	
//	@PostMapping(value="/addok")
//	public String addok(Model model, SpringDTO dto) {
//		
//		model.addAttribute("dto", dto);
//		
//		return "addok";
//	}
	
	@PostMapping(value="/addok")
	public String addok(Model model,
						//String[] cb
						@RequestParam("cb") ArrayList<String> cb) {
		
		//String[] cb = req.getParameterValues("cb")

		model.addAttribute("cb", cb);
		
		return "addok";
	}



}



	
	



























