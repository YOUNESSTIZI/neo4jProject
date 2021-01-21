package Bd.neo4j.springBootProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import Bd.neo4j.springBootProject.model.MoyenTransport;
import Bd.neo4j.springBootProject.repository.TransportRepository;

@Service
public class TransportServiceImp implements TransportService {

	@Autowired
	TransportRepository transportRepository;
	
	
	@Override
	public MoyenTransport addTransport(MoyenTransport transport) {
		
		MoyenTransport createdTransport = this.transportRepository.save(transport);
		
		return createdTransport;
	}

	@Override
	public Iterable<MoyenTransport> getTransports() {

		Iterable<MoyenTransport> transports = this.transportRepository.getAllTransports();
		
		return transports;
	}

	@Override
	public MoyenTransport getTransportById(long id) throws NotFoundException {

		Optional<MoyenTransport> transport = this.transportRepository.findById(id);
		
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
