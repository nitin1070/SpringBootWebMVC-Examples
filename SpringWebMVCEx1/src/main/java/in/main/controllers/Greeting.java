package in.main.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
	
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	@ResponseBody
	public String greetings() {
		return "Welcome To Spring Web MVC";
	}
	@GetMapping("/showDate")
	@ResponseBody
	public String showDate() {
		Date today = new Date();
		return "Current Date & Time :<h4>"+today+"</h4>";
		

	}

}
