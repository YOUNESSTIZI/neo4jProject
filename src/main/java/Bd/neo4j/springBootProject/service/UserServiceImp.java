package Bd.neo4j.springBootProject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bd.neo4j.springBootProject.model.Usager;
import Bd.neo4j.springBootProject.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<Usager> getUsers(){
		
		Iterable<Usager> users = this.userRepository.getAllUsers();
		
		return users;
	}

	@Override
	public Usager addUser(Usager user) {

		Usager savedUser = this.userRepository.save(user);
		
		return savedUser;
	}
	
	@Override
	public Boolean deleteUser(Long id) {
		
		this.userRepository.deleteById(id);;
		
		return true;
		
	}

}
