package beans;

public interface Game {
	
	void setHomeTeam(Team team);
	Team getHomeTeam();
	void setAwayTeam(Team team);
	Team getAwayTeam();
	String playGame();

}
