import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Game;
import configuration.AppConfig;


public class Main {

	public static void main(String[] args) {
		
		System.setProperty("spring.profiles.active", "first");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Game game = context.getBean("game", Game.class);
		System.out.println(game.playGame());
		
		System.out.println(context.getBeanDefinitionCount());
		for(String beanName: context.getBeanDefinitionNames())
			System.out.println(beanName);
	}

}
