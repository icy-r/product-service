package com.sliit.product_service.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2ConsoleConfiguration {

	@Bean
	public ServletRegistrationBean<org.h2.server.web.JakartaWebServlet> h2Console() {
		String path = "/h2-console";
		String pathSpec = path + "/*";

		ServletRegistrationBean<org.h2.server.web.JakartaWebServlet> registrationBean =
			new ServletRegistrationBean<>(new org.h2.server.web.JakartaWebServlet());

		registrationBean.addUrlMappings(pathSpec);
		return registrationBean;
	}
}
