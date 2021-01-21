package Bd.neo4j.springBootProject.service;




import Bd.neo4j.springBootProject.model.User;

public interface UserService {

	public Iterable<User> getUsers();

	public User addUser(User user);
	
	public Boolean deleteUser(Long id) ;
	
	
}
