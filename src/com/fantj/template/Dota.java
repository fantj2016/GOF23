package com.fantj.template;

public class Dota extends Game{
    @Override
    void init() {
        System.out.println("Dota  initialize ....");
    }

    @Override
    void start() {
        System.out.println("Dota  starting....");
    }

    @Override
    void end() {
        System.out.println("Dota  ending...");
    }
}
