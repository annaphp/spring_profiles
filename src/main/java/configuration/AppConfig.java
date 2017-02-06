package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import beans.*;

@Configuration
public class AppConfig {
	
    /*
     * Spring will create only one instance of each bean (Game, RedSox, Cubs)
     * and will always return the same instance even if the method is called twice
     */
	@Bean
	public Game game(Team one, Team two){
		Game game = new BaseballGame();
		//dependency injection through setter
		game.setHomeTeam(one);
		game.setAwayTeam(two);
		return game;
	}
	
	@Bean
	public Team one(){
		return new RedSox();
	}
	
	@Bean 
	@Profile("first")
	public Team two(){
		return new Cubs();
	}
	
	@Bean(name="two")
	@Profile("second")
	public Team three(){
		return new Royals();
	}

}
