package com.example2leo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

public class DemoApplication {
    
    /*
     @RequestMapping("/")
  public String home() {
    return "tomcat del porfolio levantado";
  }
*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
