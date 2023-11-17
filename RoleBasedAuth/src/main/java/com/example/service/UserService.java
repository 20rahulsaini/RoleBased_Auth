package com.example.service;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.User;

@Service
public class UserService {

	public  List<User> getAlluser(){
     return Arrays.asList(
    		 new User("Amisha singh", "amisha123@gmail.com",22),
    		 new User("vishal Roy", "vishal2028@gmail.com", 21),
    		 new User("juliet Jenifer", "juliet998@gmail.com", 33),
    		 new User("Priyanka singh", "singhpriyanka009@gmail.com", 12)

    		);
    
    }
	
	public  List<User> singleuser(){
	     return Arrays.asList(
	    		 new User("Rahul", "rahul123@gmail.com",22)
	    		

	    		);
	    
	    }

	
	
}
