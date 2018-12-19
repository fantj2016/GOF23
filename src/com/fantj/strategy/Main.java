package com.fantj.strategy;

public class Main {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(new AddHandler());
        System.out.println(strategyContext.execute(5, 5));

        StrategyContext strategyContext1 = new StrategyContext(new SubtractHandler());
        System.out.println(strategyContext1.execute(9,6 ));
    }
}
