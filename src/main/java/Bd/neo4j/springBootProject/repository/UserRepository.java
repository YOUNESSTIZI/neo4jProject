package Bd.neo4j.springBootProject.repository;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import Bd.neo4j.springBootProject.model.Usager;


@Repository
public interface UserRepository extends Neo4jRepository<Usager, Long>{
	
	
	

	@Query("Match (u:Usager) return u; ")
	public Iterable<Usager> getAllUsers();

	
	@Query("MATCH (a:Usager),(b:MoyenTransport) Where "
			+ "a.name = $userName AND b.name = $transportName "
			+ " CREATE (a) -[r:utilise {preference: $degreePreference }]->(b) RETURN r.preference;" )
	public long addRelation(
			 String userName, 
			 String transportName,
			 int degreePreference);

	
	@Query("MATCH (a:Usager)-[r:utilise]->(b:MoyenTransport) Where "
			+ "a.name = $userName AND b.name = $transportName "
			+ " Delete r;" )
	public void deleteRelation(
			 String userName, 
			 String transportName
			 );
	
	
	
	
	



}
