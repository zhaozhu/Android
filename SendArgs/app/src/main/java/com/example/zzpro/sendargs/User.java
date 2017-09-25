package com.example.zzpro.sendargs;

import java.io.Serializable;

/**
 * Created by zzpro on 2017/8/22.
 */

public class User implements Serializable{
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public User(String name,int age){
        this.age=age;
        this.name=name;
    }
}
