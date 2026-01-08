package com.app.tiktactoedesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TikTacToeDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(TikTacToeDesignApplication.class, args);
        System.out.println("the TicTacToe is starting");
        TicTacToeGame game=new TicTacToeGame(3);
        System.out.println(game.startGame());
        System.exit(0);
    }

}
