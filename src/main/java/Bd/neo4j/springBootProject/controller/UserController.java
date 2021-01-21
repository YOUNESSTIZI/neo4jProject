package Bd.neo4j.springBootProject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Bd.neo4j.springBootProject.model.User;
import Bd.neo4j.springBootProject.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@GetMapping()
	public ResponseEntity<Iterable<User>> getUsers() {
		Iterable<User> users ;
		
		
			
			users =  this.userService.getUsers();
			
			return ResponseEntity.status(HttpStatus.OK).body(users);
		
			
		
	}
	
	
	
	@PostMapping()
	public ResponseEntity<User> addUser(@ModelAttribute User user){
		
		
		
			
			User createdUser = this.userService.addUser(user);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
			
		
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable long id ){
		
		
			
			this.userService.deleteUser(id);
			
			return ResponseEntity.status(HttpStatus.OK).body(null);
			
		
		
	}



}
