package com.coolsharp.dagger2.example4;

import dagger.Module;
import dagger.Provides;

@Module(includes = ModuleA.class)
public class ModuleB {
    @Provides // 의존성을 제공하는 메서드에 붙임
    int provideHelloWorld() {
        return 0;
    }
}
