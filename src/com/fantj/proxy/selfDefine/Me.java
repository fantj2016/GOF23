package com.fantj.proxy.selfDefine;

import com.fantj.proxy.jdk.People;

public class Me implements People {

    private String name;
    private String type;

    Me(String name, String type){
        this.name = name;
        this.type = type;
    }
    @Override
    public void speak() {
        System.out.println("我叫"+name+", 我要一张"+type);
    }
}
