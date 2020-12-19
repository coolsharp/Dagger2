package com.coolsharp.dagger2.example5;

import javax.inject.Inject;

public class MyClass {
    @Inject
    String str;

    public String getStr() {
        return str;
    }

    public void setStr() {

    }
}
