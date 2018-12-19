package com.fantj.proxy.cglib;

import com.fantj.proxy.jdk.People;

public class Me {

    private String name = "FantJ";
    private String type = "JAY演唱会门票";

    Me() {

    }

    Me(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void speak() {
        System.out.println("我叫"+name+", 我要一张"+type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
