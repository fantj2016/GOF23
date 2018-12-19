package com.fantj.delegate;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(new WorkerA());
        /**
         * 看上去是boss在干活，其实是worker的功劳
         */
        boss.doing();
    }
}
