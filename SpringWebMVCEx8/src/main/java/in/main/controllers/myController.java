package in.main.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class myController {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String homePage() {
		return "login.html";
	}
	
	@RequestMapping(value = "/send",method = RequestMethod.GET)
	public ModelAndView show(@RequestParam(value = "name")String name) {
	   ModelAndView mv = new ModelAndView();
	    mv.addObject("name",name);
		Date today = new Date();
		mv.addObject("date",today);
	    mv.setViewName("home.jsp");
	    return mv;
		
	  
	}

}

