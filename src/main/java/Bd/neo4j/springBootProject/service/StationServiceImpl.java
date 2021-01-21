package Bd.neo4j.springBootProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import Bd.neo4j.springBootProject.model.Station;
import Bd.neo4j.springBootProject.repository.StationRepository;

@Service
public class StationServiceImpl implements StationService {
	
	@Autowired
	StationRepository stationRepository;

	@Override
	public Station addStation(Station station) {

		Station savedStation = this.stationRepository.save(station);
		
		return savedStation;
	}


	@Override
	public Station getStationById(long id) throws NotFoundException{

		Optional<Station> station = this.stationRepository.findById(id);
		
		if(station.isPresent()) {
			return station.get();
		}
		else {
			
			throw new NotFoundException();

		}
		
	}




	@Override
	public Iterable<Station> getStations() {
		Iterable<Station> stations = this.stationRepository.getAllStations();
		
		return stations;
	}


	@Override
	public Boolean deleteStationById(long id) {
		
		this.stationRepository.deleteById(id);
		return true;
	}

}
