package Bd.neo4j.springBootProject.repository;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import Bd.neo4j.springBootProject.model.User;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long>{

	@Query("Match (u:User) return u; ")
	public Iterable<User> getAllUsers();

	



}
