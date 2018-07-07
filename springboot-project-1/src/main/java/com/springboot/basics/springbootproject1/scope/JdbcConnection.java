package com.springboot.basics.springbootproject1.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
	
}
