package com.coolsharp.dagger2.example4;

import androidx.annotation.Nullable;

import dagger.Module;
import dagger.Provides;

@Module // 의존성을 제공하는 클래스에 붙임
public class ModuleA {
    @Provides // 의존성을 제공하는 메서드에 붙임
    String provideHelloWorld() {
        return "Hello World";
    }
}
