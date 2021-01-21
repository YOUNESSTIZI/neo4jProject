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

import Bd.neo4j.springBootProject.model.MoyenTransport;
import Bd.neo4j.springBootProject.service.TransportService;

@Controller
@RequestMapping("/transport")
public class TransportController {


	@Autowired
	TransportService transportService;
	
	
	@GetMapping()
	public ResponseEntity<Iterable<MoyenTransport>> getTransports() {
		
		Iterable<MoyenTransport> transports =  this.transportService.getTransports();
			
		return ResponseEntity.status(HttpStatus.OK).body(transports);
		
				
	}	
	
	@PostMapping()
	public ResponseEntity<MoyenTransport> addTransport(@ModelAttribute MoyenTransport transport){
		
		
		
			
		MoyenTransport createdTransport = this.transportService.addTransport(transport);
			
		return ResponseEntity.status(HttpStatus.CREATED).body(createdTransport);
			
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<MoyenTransport> deleteTransport(@PathVariable long id ){
		
		
			
			this.transportService.deleteTransportById(id);
			
			return ResponseEntity.status(HttpStatus.OK).body(null);
			
		
		
	}
}
