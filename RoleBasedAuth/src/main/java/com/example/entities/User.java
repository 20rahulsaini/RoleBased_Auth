package com.example.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor; 
import lombok.Data;
import lombok.NoArgsConstructor;




@EntityScan
public class User {

	  private String name ;
	  private String email;
	  private int age ;
	   
 

	
  
public User(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}


public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

   
	

}
