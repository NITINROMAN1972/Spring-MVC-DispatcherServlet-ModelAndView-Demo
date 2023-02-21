package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/save")
	public ModelAndView load() {
	  System.out.println("Reaching ");
	  
	  ModelAndView modelAndView = new ModelAndView("createteacher");
	}

}
