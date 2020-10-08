package com.shri.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.shri.user.vo.UserVo;

@Controller
public class UserController {
	
	@RequestMapping("/entryadduser.do")
	public String entryAddUser(@ModelAttribute("user") UserVo user){
		return "person";
	}
	
	@RequestMapping("/processadduser.do")
	public String processAddUser(@ModelAttribute("user") UserVo user){
		System.out.println("The first name "+user.getFirstName());
			
		//1)Capturing the data
		//2)Processing
		//2a)Validation
		//2b)Db Interaction
		//3)Step 3 response
		return "success" ;
		
	}
	
	

}
