package com.fantj.strategy;


public class AddHandler implements Strategy{
    @Override
    public int handler(int a, int b) {
        return a+b;
    }
}
