package Bd.neo4j.springBootProject.model;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class MoyenTransport {
	
	@Id @GeneratedValue private Long id;
	
	private String name;
	
	private long numero;
	
	private String information;
	
	

	@Relationship(type= "arrive_a", direction= Relationship.OUTGOING)
	private List<Station> stations;
	
	@Relationship(type= "utilise", direction= Relationship.INCOMING)
	private List<Usager> users;
	
	

	public MoyenTransport() {
		super();
	}

	public List<Station> getStations() {
		return stations;
	}

	public List<Usager> getUsers() {
		return users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	
	
	

}
