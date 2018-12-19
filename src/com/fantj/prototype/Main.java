package com.fantj.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 只支持9种数据类型的深拷贝： 8大基本类型（int long float double boolean char short  byte ）+String
 * 其他(List等)默认都是浅拷贝，但是我们也能通过他们自身的clone方法来深拷贝。
 */
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        List cloneList = (List) ((ArrayList) list).clone();
        PeoplePrototype prototype = new PeoplePrototype();
        prototype.setAge(20);
        prototype.setName("FantJ");
        try {
            PeoplePrototype clone = (PeoplePrototype)prototype.clone();
            System.out.println(clone.getAge());
            System.out.println(clone == prototype);
            System.out.println(clone+"    "+prototype);
            System.out.println(clone.getClass()  +"     "+ prototype.getClass());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
