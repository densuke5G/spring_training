package jp.co.sss.training.lesson06_02;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.sss.training.lesson06_01.Message0601Filter;

@Configuration
public class Fliter0602Config {
	
	@Bean
	public FilterRegistrationBean<Message0602Filter> configMessage0602Filter() {
		FilterRegistrationBean<Message0602Filter> bean = new FilterRegistrationBean<Message0602Filter>();
		
		bean.setFilter(new Message0602Filter());
		bean.setOrder(2);
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean<Message0601Filter> configMessage0601Filter() {
		FilterRegistrationBean<Message0601Filter> bean = new FilterRegistrationBean<Message0601Filter>();
		
		bean.setFilter(new Message0601Filter());
		bean.setOrder(1);
		return bean;
	}
}
