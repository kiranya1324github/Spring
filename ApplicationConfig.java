package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


		@Configuration //<bean id="obj" class="pack.class">
		public class ApplicationConfig {
			
			@Bean
			public Samsung getPhone() {
				
				 return new Samsung();
				
			}
			@Bean
			public MobileProcessor getProcessor() {
				return new SnapDragon();
			}
		}



	


