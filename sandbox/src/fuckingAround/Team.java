package fuckingAround;

public class Team {
	
	static String teamName;
	
	public Team() {
		
		teamName = "";
		
	}
	
	public Team(String newName) {
		setName(newName);
	}
	
	public String getName () {
		return teamName;
	}
	
	private void setName (String newName) {
		teamName = newName;
	}
	
	public String toString() {
		return ("Team name: " + teamName);
	}
	
	public boolean equals (Object o) {
		if ( ! ( o instanceof Team)){
			return false;
		} else {
			Team team = (Team) o;
			if ( teamName == team.teamName) {
				return true;
			} else {
				return false;
			}
		}
	}
}
