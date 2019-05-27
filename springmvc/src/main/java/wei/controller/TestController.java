package wei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.Test;

@Controller
public class TestController {
	@Autowired
	private Test test;
	
	@RequestMapping("/fangwen")
	public String fangwen() {
		
		test.show();
		return "success";
	}
}
