package com.fantj.template;

public abstract class Game {
    abstract void init();
    abstract void start();
    abstract void end();

    /**
     * 方法必须是final ，固定的模板不允许改变
     */
    public final void play(){
        init();
        start();
        end();
    }
}
