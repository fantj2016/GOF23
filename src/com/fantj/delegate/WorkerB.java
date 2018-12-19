package com.fantj.delegate;

public class WorkerB implements Task{
    @Override
    public void doing() {
        System.out.println("我是work-B,老板委派我做任务,活其实是我干的，功劳是老板的");
    }
}
