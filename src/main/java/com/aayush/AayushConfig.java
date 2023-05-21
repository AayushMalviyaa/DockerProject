package com.aayush;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.aayush"})
public class AayushConfig 
{
	@Bean
public InternalResourceViewResolver viewResolver()
{
	InternalResourceViewResolver vr=new InternalResourceViewResolver();
			vr.setPrefix("");
	        vr.setSuffix(".jsp");
	        return vr;
}
}
