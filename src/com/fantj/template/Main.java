package com.fantj.template;

public class Main {
    public static void main(String[] args) {
        Game game= new LoL();
        game.play();

        game = new Dota();
        game.play();

    }
}
