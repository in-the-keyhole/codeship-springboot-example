package com.keyholesoftware.exmple.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by markdeterman on 11/6/15.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}
