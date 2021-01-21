package Bd.neo4j.springBootProject.service.relationsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bd.neo4j.springBootProject.model.MoyenTransport;
import Bd.neo4j.springBootProject.model.Usager;
import Bd.neo4j.springBootProject.model.UserTransportRelation;
import Bd.neo4j.springBootProject.repository.TransportRepository;
import Bd.neo4j.springBootProject.repository.UserRepository;

@Service
public class UserRelationServiceImp implements UserRelationService {
	
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	TransportRepository transportRepository;

	@Override
	public boolean addUserRelation(UserTransportRelation userTransportRelation) {
		
		Usager user = this.userRepository.findById(userTransportRelation.getUserId()).get();
		MoyenTransport transport = this.transportRepository.findById(userTransportRelation.getTransportId()).get();
		
		int degreePreference = userTransportRelation.getDegreePreference();
		
		
		this.userRepository.addRelation(user.getName(), transport.getName(), degreePreference);
		
		
		return true;
	}

	@Override
	public void deleteUserRelation(UserTransportRelation userTransportRelation) {
		Usager user = this.userRepository.findById(userTransportRelation.getUserId()).get();
		MoyenTransport transport = this.transportRepository.findById(userTransportRelation.getTransportId()).get();

		
		this.userRepository.deleteRelation(user.getName(), transport.getName());

	}

	
	
	

}
