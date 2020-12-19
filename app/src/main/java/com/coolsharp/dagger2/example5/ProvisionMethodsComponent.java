package com.coolsharp.dagger2.example5;

import dagger.Component;
import dagger.MembersInjector;

@Component(modules = CoffeeMakerModule.class)
public interface ProvisionMethodsComponent {
    void inject(MyClass myClass);

    MembersInjector<MyClass> getInjector();
}
