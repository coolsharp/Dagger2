package com.coolsharp.dagger2.example4;

import androidx.annotation.Nullable;

import com.coolsharp.dagger2.example2.Cpu;
import com.coolsharp.dagger2.example2.IntelCpu;

import dagger.Module;
import dagger.Provides;

@Module // 의존성을 제공하는 클래스에 붙임
public class MyModule {
    @Provides // 의존성을 제공하는 메서드에 붙임
    @Nullable // 널 값 반환 허용
    String provideHelloWorld() {
        return "Hello World";
    }

    @Provides
    int provideAge() {
        return 100;
    }

    @Provides
    Person providePerson(String name, int age) {
        return new Person(name, age);
    }
}
