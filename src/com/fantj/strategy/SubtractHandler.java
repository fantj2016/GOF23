package com.fantj.strategy;

public class SubtractHandler implements Strategy{
    @Override
    public int handler(int a, int b) {
        return a-b;
    }
}
