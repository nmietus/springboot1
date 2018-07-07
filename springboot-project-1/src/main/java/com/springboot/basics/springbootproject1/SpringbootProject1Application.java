
package com.springboot.basics.springbootproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.util.SystemInfo;

@SpringBootApplication
public class SpringbootProject1Application {
	
	public static void main(String[] args) {
		
//		BinarySearchImplement binarySearch = 
//				new BinarySearchImplement(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringbootProject1Application.class, args);
		
		BinarySearchImplement binarySearch = applicationContext.getBean(BinarySearchImplement.class);
		
		int result = 
				binarySearch.binarySearch(new int[] {12, 4, 5}, 3);
		System.out.println(result);
		
		
	}
}