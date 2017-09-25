package com.example.zzpro.transdata;

import java.io.Serializable;

/**
 * Created by zzpro on 2017/9/16.
 */

public class User implements Serializable{
    int age;
    String name;

    User(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
