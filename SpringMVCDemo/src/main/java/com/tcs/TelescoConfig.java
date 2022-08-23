package com.tcs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.tcs"})
public class TelescoConfig {
	@Bean
	public InternalResourceViewResolver viewResolver ()
	{
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("WEB-INF/");
		irvr.setSuffix(".jsp");
		
		return irvr;
	}
}
