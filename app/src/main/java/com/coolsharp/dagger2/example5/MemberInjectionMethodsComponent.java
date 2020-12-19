package com.coolsharp.dagger2.example5;

import androidx.annotation.Nullable;

import com.coolsharp.dagger2.example2.Cpu;
import com.coolsharp.dagger2.example4.MyModule;

import dagger.Component;
import dagger.MembersInjector;
import dagger.Provides;

@Component(modules = CoffeeMakerModule.class)
public interface MemberInjectionMethodsComponent {
    void inject(MyClass myClass);

    MembersInjector<CoffeeMaker> getInjector();
}
