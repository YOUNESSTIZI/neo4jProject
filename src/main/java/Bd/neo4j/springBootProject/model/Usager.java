package Bd.neo4j.springBootProject.model;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.boot.rsocket.server.RSocketServer.Transport;

@NodeEntity
public class Usager {

	
	@Id @GeneratedValue private Long id;
	
	private String name;
	private String Handicap;
	private String Fonction;
	private String Annee_De_Naissance;
	
	@Relationship(type= "utilise", direction= Relationship.OUTGOING )
	private List<MoyenTransport> transports;
	
	
	
	public String getFonction() {
		return Fonction;
	}


	public void setFonction(String fonction) {
		this.Fonction = fonction;
	}


	public String getAnnee_De_Naissance() {
		return Annee_De_Naissance;
	}


	public void setAnnee_De_Naissance(String annee_De_Naissance) {
		this.Annee_De_Naissance = annee_De_Naissance;
	}


	public List<MoyenTransport> getTransports() {
		return transports;
	}


	public Usager() {
		super();
	}


	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String isHandicap() {
		return Handicap;
	}


	public void setHandicap(String isHandicap) {
		this.Handicap = isHandicap;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	


	
}
