package com.fantj.strategy;

public class StrategyContext {
    private Strategy strategy;

    StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    public int execute(int a, int b){
        return strategy.handler(a, b);
    }
}
