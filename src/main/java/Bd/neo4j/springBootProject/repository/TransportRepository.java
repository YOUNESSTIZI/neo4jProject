package Bd.neo4j.springBootProject.repository;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import Bd.neo4j.springBootProject.model.MoyenTransport;

@Repository
public interface TransportRepository extends Neo4jRepository<MoyenTransport, Long>{

	@Query("Match (u:MoyenTransport) return u; ")
	public Iterable<MoyenTransport> getAllTransports();

	



}
