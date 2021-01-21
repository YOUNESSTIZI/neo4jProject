package Bd.neo4j.springBootProject.model;

public class UserTransportRelation {
	/*
	 * this model will be used to recieve multiple objects to relate
	 */
	private long userId;
	
	private long transportId;
	
	private int degreePreference;
	
	
	

	public UserTransportRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getTransportId() {
		return transportId;
	}

	public void setTransportId(long transportId) {
		this.transportId = transportId;
	}

	public int getDegreePreference() {
		return degreePreference;
	}

	public void setDegreePreference(int degreePreference) {
		this.degreePreference = degreePreference;
	}
	
	
	
	

}
