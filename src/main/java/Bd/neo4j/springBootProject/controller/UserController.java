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

import Bd.neo4j.springBootProject.model.Usager;
import Bd.neo4j.springBootProject.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@GetMapping()
	public ResponseEntity<Iterable<Usager>> getUsers() {
		Iterable<Usager> users ;
		
		
			
			users =  this.userService.getUsers();
			
			return ResponseEntity.status(HttpStatus.OK).body(users);
		
			
		
	}
	
	
	
	@PostMapping()
	public ResponseEntity<Usager> addUser(@ModelAttribute Usager user){
		
		
		
			
		Usager createdUser = this.userService.addUser(user);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
			
		
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<Usager> deleteUser(@PathVariable long id ){
		
		
			
			this.userService.deleteUser(id);
			
			return ResponseEntity.status(HttpStatus.OK).body(null);
			
		
		
	}

	
	


}
