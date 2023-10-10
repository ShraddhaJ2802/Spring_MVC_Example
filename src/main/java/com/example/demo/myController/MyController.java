package com.example.demo.myController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {	

	@RequestMapping(value ="/web",method = RequestMethod.GET)	
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping(value = "/message",method = RequestMethod.GET)
	
	public String message(Model model)
	{
		model.addAttribute( "message", "This is 1st mvc prg");
		return "message";
	}
	
}
