package Bd.neo4j.springBootProject.service;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import Bd.neo4j.springBootProject.model.Station;

public interface StationService {
	
	public Station addStation(Station station);
	
	public Iterable<Station> getStations();
	
	public Station getStationById(long id) throws NotFoundException;
	
	public Boolean deleteStationById(long id);

	public Iterable<Station> getTransitStations(String station1, String station2);
}
