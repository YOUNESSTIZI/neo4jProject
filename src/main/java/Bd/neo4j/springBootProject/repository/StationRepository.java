package Bd.neo4j.springBootProject.repository;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import Bd.neo4j.springBootProject.model.Station;

@Repository
public interface StationRepository extends Neo4jRepository<Station, Long>{

	@Query("Match (u:Station) return u; ")
	public Iterable<Station> getAllStations();

	
	
	@Query("MATCH (m:Station {name: $stationDepart }),(g:Station{name: $stationArrive})," + 
			"path = (m)-[suit*]->(g)" + 
			"RETURN nodes(path);")
	public Iterable<Station> getTransitStation(String stationDepart, String stationArrive);


}
