package in.main.controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class myController {
	
	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public String show(Model model) {
		
		List<String>list=Arrays.asList("Java","Python","C++");
		Date today = new Date();
		model.addAttribute("date", today);
	    model.addAttribute("list", list);

		return "home.jsp";
		
		
	}

}
