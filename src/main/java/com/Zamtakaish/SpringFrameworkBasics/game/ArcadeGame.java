package com.Zamtakaish.SpringFrameworkBasics.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ArcadeGame implements GamingConsole{

    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Crouch");
    }
    public void left() {
        System.out.println("Move Back");
    }
    public void right() {
        System.out.println("Move Forward");
    }
}
