package com.fantj.delegate;

public class WorkerA implements Task{
    @Override
    public void doing() {
        System.out.println("我是work-A,老板委派我做任务,活其实是我干的，但是功劳是老板的");
    }
}
