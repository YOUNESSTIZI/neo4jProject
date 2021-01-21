package Bd.neo4j.springBootProject.model;


import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Station {
	
	@Id @GeneratedValue private Long id;
	private String name;
	
	@Relationship(type= "Suit", direction= Relationship.INCOMING )
	private Station stationPrecedente;
	
	
	@Relationship(type= "Suit", direction= Relationship.OUTGOING )
	private Station stationSuivante;
	
	@Relationship(type= "arrive_a", direction= Relationship.INCOMING)
	private MoyenTransport transport;
	
	public Station getStationPrecedente() {
		return stationPrecedente;
	}


	public Station getStationSuivante() {
		return stationSuivante;
	}


	public Station() {
		super();
	}


	public Station(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	@Override
	public String toString() {
		return "Station [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
