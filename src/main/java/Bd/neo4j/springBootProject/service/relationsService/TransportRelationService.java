package Bd.neo4j.springBootProject.service.relationsService;

import Bd.neo4j.springBootProject.model.UserTransportRelation;

public interface TransportRelationService {
	
	public boolean addTransportRelation(UserTransportRelation userTransportRelation);

	public void deleteTransportRelation(UserTransportRelation use);
}
