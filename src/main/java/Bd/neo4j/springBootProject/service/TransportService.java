package Bd.neo4j.springBootProject.service;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import Bd.neo4j.springBootProject.model.Station;
import Bd.neo4j.springBootProject.model.Transport;

public interface TransportService {
	
	public Transport addTransport(Transport transport);
	
	public Iterable<Transport> getTransports();
	
	public Transport getTransportById(long id) throws NotFoundException;
	
	public Boolean deleteTransportById(long id);
}
