package com.techtalentsouth.herokuDemo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //signifies its a controller
public class MainController {
		
	public MainController() {
			
		}
	
	
	@GetMapping("/")
	public ModelAndView indexMethod() {
		
		//return model and view 
		ModelAndView mv = new ModelAndView("index");
		return mv;
		
	}

}
