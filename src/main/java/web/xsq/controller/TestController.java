package web.xsq.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import web.xsq.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/name/{name}")
	public ModelAndView testway(@PathVariable("name") String name){
		ModelAndView mv = new ModelAndView(name);
		testService.testway();
		return mv;
		
	}
	
	
	
	
}

