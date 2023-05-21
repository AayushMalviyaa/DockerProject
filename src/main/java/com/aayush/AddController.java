package com.aayush;
import javax.servlet.http.*;
import com.aayush.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.*;



import org.springframework.web.bind.annotation.*;
@Controller
public class AddController 
{
	@RequestMapping("/op")
	public ModelAndView add(@RequestParam("t1") int a,@RequestParam("t2") int b, HttpServletRequest req,HttpServletResponse res)
	{
//		int a=Integer.parseInt(req.getParameter("t1"));
//		int b=Integer.parseInt(req.getParameter("t2"));
		
		
		String selection=req.getParameter("operation");
		ModelAndView mv=new ModelAndView();
		if(selection.equals("add"))
		{AddService as=new AddService();
		int res1=as.add(a, b);
		
		mv.addObject("res", res1);
		mv.setViewName("Display");
		}
		else if(selection.equals("sub"))
		{ 
			AddService as=new AddService();
			int res1=as.sub(a, b);
			
			mv.addObject("res", res1);
			mv.setViewName("Display");
		}
		else if(selection.equals("mul"))
          {AddService as=new AddService();
  		int res1=as.prod(a, b);
		
  		mv.addObject("res", res1);
  		mv.setViewName("Display");
		}
		else
		{AddService as=new AddService();
		double res1=as.div(a, b);
		
		mv.addObject("res", res1);
		mv.setViewName("Display");
		}
		return mv ;
	}

}
