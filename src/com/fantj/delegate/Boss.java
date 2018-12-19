package com.fantj.delegate;

public class Boss implements Task{

    private Task task;

    Boss(Task task){
        this.task = task;
    }
    @Override
    public void doing() {
        System.out.println("我是BOSS,我要开始委派人做任务拉,我不管你做任务的过程(是否加班),我只要这个任务的结果");
        task.doing();
    }
}
