package com.hqyj.SpringBootDemo.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test/desc")
	@ResponseBody
	public String testDesc() {
		System.out.println("执行完毕");
		return "This is test module desc";
		
	}

}
