package Bd.neo4j.springBootProject.model;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class User {

	
	@Id @GeneratedValue private Long id;
	
	private String name;
	private int age;
	private boolean handicap;
	private String fonction;
	private String annee_De_Naissance;
	
	@Relationship(type= "Utilise", direction= Relationship.OUTGOING )
	private List<Transport> transports;
	
	
	
	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public String getAnnee_De_Naissance() {
		return annee_De_Naissance;
	}


	public void setAnnee_De_Naissance(String annee_De_Naissance) {
		this.annee_De_Naissance = annee_De_Naissance;
	}


	public List<Transport> getTransports() {
		return transports;
	}


	public User() {
		super();
	}


	public User(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	

	public boolean isHandicap() {
		return handicap;
	}


	public void setHandicap(boolean isHandicap) {
		this.handicap = isHandicap;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
