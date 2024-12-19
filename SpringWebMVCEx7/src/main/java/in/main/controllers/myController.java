package in.main.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class myController {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String homePage() {
		return "login.html";
	}
	
	@RequestMapping(value = "/send",method = RequestMethod.GET)
	public String show(HttpServletRequest request,Model model) {
	    String name=request.getParameter("name");
		model.addAttribute("name",name);
		Date today = new Date();
		model.addAttribute("date",today);
	  return "home.jsp";

		
	    	
	}

}

