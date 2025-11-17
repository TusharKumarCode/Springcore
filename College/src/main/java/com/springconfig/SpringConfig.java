package com.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tushar.Lecture;

@Configuration
public class SpringConfig {
     
	 @Bean("clg")
	 public Lecture createLectureBean() {
		 
		 Lecture lec= new Lecture();
		 
		 lec.setName("pratap");
		 lec.setDep("science");
		 lec.setSalary(43778);
		 
		 return lec;
		 
	 }
}
