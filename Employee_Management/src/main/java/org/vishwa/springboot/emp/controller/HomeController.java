/**
 * 
 */
package org.vishwa.springboot.emp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YUVI
 *
 */
@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/greeting")
	public String welcomeMessage() {
		return "welcome to Employee Management Project";
	}

}
