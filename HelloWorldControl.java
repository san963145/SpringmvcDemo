package com.cn.myspring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloWorldControl {
	
	@RequestMapping("hello")
	public String hello(){
		return "hello";
	}

}
