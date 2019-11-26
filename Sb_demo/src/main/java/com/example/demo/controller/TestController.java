package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
		
		@RequestMapping("/test/info")
		@ResponseBody
		public String getInfo() {
			
			return "A U OK?";
		}
		
		@Value("${server.port}")
		private int port;
		@Value("${com.example.name}")
		private String name;
		@Value("${com.example.age}")
		private int age;
		@Value("${com.example.description}")
		private String description;
		@Value("${com.example.random}")
		private String random;
		
		
		
		@RequestMapping("/test/config")
		@ResponseBody
		public String getConfig(){
			
			StringBuffer sb = new StringBuffer();
			sb.append(port)
					.append("----").append("<br>")
					.append(name)
					.append("----").append("<br>")
					.append(age).append("----").append("<br>")
					.append(description).append("----").append("<br>")
					.append(random).append("----").append("<br>");
				
			
			
			
			return sb.toString();
			
			
		}
}
