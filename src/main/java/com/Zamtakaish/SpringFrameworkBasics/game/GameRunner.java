package com.Zamtakaish.SpringFrameworkBasics.game;

public class GameRunner {

    //private HeroesGame game;
    private ArcadeGame game;

    /*public GameRunner(HeroesGame game) {
        this.game = game;
    }*/
    public GameRunner(ArcadeGame game) {
        this.game = game;
    }

    public void runGame(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
