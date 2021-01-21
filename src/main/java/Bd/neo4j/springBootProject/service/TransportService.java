package Bd.neo4j.springBootProject.service;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import Bd.neo4j.springBootProject.model.MoyenTransport;

public interface TransportService {
	
	public MoyenTransport addTransport(MoyenTransport transport);
	
	public Iterable<MoyenTransport> getTransports();
	
	public MoyenTransport getTransportById(long id) throws NotFoundException;
	
	public Boolean deleteTransportById(long id);
}
