package com.cn.myspring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class HelloWorldControl {
	
	@RequestMapping("hello")
	public String hello(@RequestParam(value="id") int id){	
		
		System.out.println("id  :"+id);
		return "hello";
	}
	
	@RequestMapping(value="helloq",method={RequestMethod.POST})
	public ModelAndView pass(@RequestParam("a") String a,@RequestParam("b") String b){		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World!");
		mv.setViewName("result");
		return mv;
	}

}
