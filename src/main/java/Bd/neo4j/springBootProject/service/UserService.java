package Bd.neo4j.springBootProject.service;

import Bd.neo4j.springBootProject.model.Usager;

public interface UserService {

	public Iterable<Usager> getUsers();

	public Usager addUser(Usager user);
	
	public Boolean deleteUser(Long id) ;
	
	
}
