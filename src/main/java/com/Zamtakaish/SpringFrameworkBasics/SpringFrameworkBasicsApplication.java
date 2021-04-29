package com.Zamtakaish.SpringFrameworkBasics;

import com.Zamtakaish.SpringFrameworkBasics.game.ArcadeGame;
import com.Zamtakaish.SpringFrameworkBasics.game.GameRunner;
import com.Zamtakaish.SpringFrameworkBasics.game.HeroesGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameworkBasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringFrameworkBasicsApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);

		//HeroesGame game = new HeroesGame();
		//ArcadeGame game = new ArcadeGame();

		//GameRunner runner = new GameRunner(game);

		runner.runGame();

	}

}
