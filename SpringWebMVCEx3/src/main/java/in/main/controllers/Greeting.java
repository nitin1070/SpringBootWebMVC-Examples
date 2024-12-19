package in.main.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Greeting {
	
	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public String showDateTime(HttpServletRequest request) {
		Date todayDate = new Date();
		request.setAttribute("currentDateTime", todayDate);
		return "home.jsp";
	}
	


}
