package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.security.auth.message.config.AuthConfig;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig  {

	
	@Bean
    public UserDetailsService userDetailsService() {
		
		UserDetails user = User.withUsername("Rahul")
				.password(passwordEncoder().encode("user123"))
				.roles("USER")
				.build();
		
		UserDetails admin = User
				.withUsername("Vishal")
				.password(passwordEncoder().encode("admin123"))
				.roles("ADMIN")
				.build();
		
		
		
		
		
		
		
		return new InMemoryUserDetailsManager(user,admin);
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
		
	}

	
	
	



//	@Bean
//	 public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)throws Exception {
//         httpSecurity.csrf(AbstractHttpConfigurer::disable)
//          .authorizeHttpRequests(req->
//           req.requestMatchers("/home/user-details")
//          .hasRole("ADMIN")
//          .requestMatchers("/home/admin-details")
//          .hasRole("USER")
//          .requestMatchers("/home/public")
//          .permitAll()
//          .anyRequest()
//          .authenticated()
//          
//          
//        );
//          
//         
//          
//        
//       
//          
//         
//         return httpSecurity.build();
//    		 
//    		 
//  
//    		
//    	
//	
//	}
	
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
	  
	  httpSecurity.authorizeHttpRequests((req)  -> req
		  .requestMatchers("/home/public/**").permitAll()
		  .requestMatchers("/home/admin-details/**").hasRole("ADMIN")
		  .requestMatchers("/home/user-details/**").hasRole("USER")
		
		  )
	   .formLogin();
	  
	  return  httpSecurity.build();
	}
	
	
	
	
	
	
	
	
	
	
    }












