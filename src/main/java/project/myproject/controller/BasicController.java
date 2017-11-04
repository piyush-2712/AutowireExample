package project.myproject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import project.myproject.service.StudentService;
import project.myproject.user.Student;

@Controller
@RequestMapping("/mycontroller")
public class BasicController {
	
	
	@Autowired 
	@Qualifier("beanobject")
	StudentService service;
	
	@Autowired 
	@Qualifier("beanobject2")
	StudentService service2;
	
	
	private int a=7;
	@RequestMapping(value = "/printhello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(){
		
		service.hello();
		
		return "hello";
	}
	
	
	@RequestMapping(value = "/printhelloagain", method = RequestMethod.GET)
	@ResponseBody
	public String helloagain(){
		
		service2.hello();
		
		return "hello";
	}
	
	
	
	@RequestMapping(value = "/printval", method = RequestMethod.GET)
	@ResponseBody
	public String hello(@RequestParam String hello){
		System.out.println(a);
		
		return hello;
	}
	
	@RequestMapping(value = "/returnStudentData", method = RequestMethod.POST)
	public @ResponseBody Student getStudent(@RequestBody Student student){
	System.out.println("hello friend");
	return student;	
	}


}
