package com.coolsharp.dagger2.example5;

import com.coolsharp.dagger2.example1.IntelCpu;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeMakerModule {
    @Provides
    String getStr(){
        return "coffee";
    }
}