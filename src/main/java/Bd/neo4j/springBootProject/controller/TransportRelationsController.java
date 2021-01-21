package Bd.neo4j.springBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Bd.neo4j.springBootProject.model.UserTransportRelation;
import Bd.neo4j.springBootProject.service.relationsService.UserRelationService;


@Controller
@RequestMapping("/transport/arrive")
public class TransportRelationsController {
	
	@Autowired
	UserRelationService userRelationService;

	@PostMapping()
	public ResponseEntity<Void> addUserRelation(UserTransportRelation use) {
		
			
			this.userRelationService.addUserRelation(use);
		
			return ResponseEntity.status(HttpStatus.OK).body(null);
		
			
		
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> deleteUserRelation(UserTransportRelation use) {
		
			
			this.userRelationService.deleteUserRelation(use);
		
			return ResponseEntity.status(HttpStatus.OK).body(null);
		
	}
}
