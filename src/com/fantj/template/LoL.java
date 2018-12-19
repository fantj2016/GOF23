package com.fantj.template;

public class LoL extends Game{
    @Override
    void init() {
        System.out.println("LOL initialize ....");
    }

    @Override
    void start() {
        System.out.println("LOL  starting....");
    }

    @Override
    void end() {
        System.out.println("LOL  ending...");
    }
}
