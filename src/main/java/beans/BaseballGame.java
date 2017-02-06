package beans;

public class BaseballGame implements Game{
	
	private Team homeTeam;
	private Team awayTeam;
	
	public BaseballGame(){
		
	}
	
	public BaseballGame(Team homeTeam, Team awayTeam){
		if(homeTeam == awayTeam) System.out.println("home and away are the same object on the heap");	
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}
	
	public BaseballGame(Team homeTeam){
		this.homeTeam = homeTeam;
	}

	public void setHomeTeam(Team team) {
		homeTeam = team;
		
	}

	public Team getHomeTeam() {
		// TODO Auto-generated method stub
		return homeTeam;
	}

	public void setAwayTeam(Team team) {
		awayTeam=team;
	}

	public Team getAwayTeam() {
		// TODO Auto-generated method stub
		return awayTeam;
	}

	public String playGame() {
		System.out.println("home " + homeTeam.getName());
		System.out.println("awya " + awayTeam.getName());


		return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
	}

}
