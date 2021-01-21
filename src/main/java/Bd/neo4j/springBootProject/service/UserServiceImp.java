package Bd.neo4j.springBootProject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bd.neo4j.springBootProject.model.User;
import Bd.neo4j.springBootProject.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> getUsers(){
		
		Iterable<User> users = this.userRepository.getAllUsers();
		
		return users;
	}

	@Override
	public User addUser(User user) {

		User savedUser = this.userRepository.save(user);
		
		return savedUser;
	}
	
	@Override
	public Boolean deleteUser(Long id) {
		
		this.userRepository.deleteById(id);;
		
		return true;
		
	}

}
