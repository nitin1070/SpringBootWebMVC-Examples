package in.main.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class myController {
	
	@RequestMapping(value = "/send",method = RequestMethod.GET)
	public String show(HttpServletRequest request) {
		List<String>list=Arrays.asList("Java","Python","C++");
		request.setAttribute("stdName", "Nitin");
		request.setAttribute("myList", list);
	
		return "home.jsp";
		
		
	}

}
