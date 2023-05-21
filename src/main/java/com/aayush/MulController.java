package com.aayush;
import javax.servlet.http.*;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.*;

import com.aayush.service.AddService;

import org.springframework.web.bind.annotation.*;
@Controller
public class MulController 
{
	@RequestMapping("/mul")
	public ModelAndView add(@RequestParam("t1")int i,@RequestParam("t2")int j)
	{
		ModelAndView mv=new ModelAndView();
		int k=i*j;
		mv.addObject("res", k);
		mv.setViewName("Display");
		return mv;
	}

}
