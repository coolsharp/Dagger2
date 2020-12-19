package com.coolsharp.dagger2.example5;

import com.coolsharp.dagger2.example2.Cpu;
import com.coolsharp.dagger2.example2.IntelCpu;

import javax.inject.Inject;

public class CoffeeMaker {
    @Inject
    String str;

    @Inject
    public CoffeeMaker(String str){
        this.str = str;
    }

    public CoffeeMaker() {

    }

    public String getStr() {
        return str;
    }
}
