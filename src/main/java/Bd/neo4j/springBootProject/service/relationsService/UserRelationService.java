package Bd.neo4j.springBootProject.service.relationsService;

import Bd.neo4j.springBootProject.model.UserTransportRelation;

public interface UserRelationService {
	
	public boolean addUserRelation(UserTransportRelation userTransportRelation);

	public void deleteUserRelation(UserTransportRelation use);

}
