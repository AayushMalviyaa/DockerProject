package com.aayush;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class AddController 
{
	@RequestMapping("/add")
	public void add()
	{
		System.out.println("I am here");
	}

}
