package com.Zamtakaish.SpringFrameworkBasics;

import com.Zamtakaish.SpringFrameworkBasics.game.ArcadeGame;
import com.Zamtakaish.SpringFrameworkBasics.game.GameRunner;
import com.Zamtakaish.SpringFrameworkBasics.game.HeroesGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkBasicsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkBasicsApplication.class, args);

		//HeroesGame game = new HeroesGame();
		ArcadeGame game = new ArcadeGame();

		GameRunner runner = new GameRunner(game);

		runner.runGame();

	}

}
