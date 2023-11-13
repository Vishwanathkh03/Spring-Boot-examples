/**
 * 
 */
package org.vishwa.springboot.emp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YUVI
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping("/all")
	public ResponseEntity<String> fetchAllEmployees(){
		return ResponseEntity.ok("All employees");
	}
	
}
