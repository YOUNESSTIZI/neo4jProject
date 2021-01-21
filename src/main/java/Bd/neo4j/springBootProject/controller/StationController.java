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

import Bd.neo4j.springBootProject.model.Station;
import Bd.neo4j.springBootProject.service.StationService;


@Controller
@RequestMapping("/station")
public class StationController {
	
	@Autowired
	StationService stationService;
	
	
	@GetMapping()
	public ResponseEntity<Iterable<Station>> getStations() {
		
		Iterable<Station> stations =  this.stationService.getStations();
			
			return ResponseEntity.status(HttpStatus.OK).body(stations);
			
	}
	
	
	
	@PostMapping()
	public ResponseEntity<Station> addStation(@ModelAttribute Station station){
			
			Station createdStation = this.stationService.addStation(station);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(createdStation);
			
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<Station> deleteStationById(@PathVariable long id ){
		
		
			
			this.stationService.deleteStationById(id);
			
			return ResponseEntity.status(HttpStatus.OK).body(null);
			
		
		
	}



}
