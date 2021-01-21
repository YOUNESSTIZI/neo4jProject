package Bd.neo4j.springBootProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import Bd.neo4j.springBootProject.model.Transport;
import Bd.neo4j.springBootProject.repository.TransportRepository;

@Service
public class TransportServiceImp implements TransportService {

	@Autowired
	TransportRepository transportRepository;
	
	
	@Override
	public Transport addTransport(Transport transport) {
		
		Transport createdTransport = this.transportRepository.save(transport);
		
		return createdTransport;
	}

	@Override
	public Iterable<Transport> getTransports() {

		Iterable<Transport> transports = this.transportRepository.getAllTransports();
		
		return transports;
	}

	@Override
	public Transport getTransportById(long id) throws NotFoundException {

		Optional<Transport> transport = this.transportRepository.findById(id);
		
		if(transport.isPresent()) {
			return transport.get();
		}
		else {
			
			throw new NotFoundException();
		}
		
	}

	@Override
	public Boolean deleteTransportById(long id) {
		
		this.transportRepository.deleteById(id);
		return true;
	}

}
