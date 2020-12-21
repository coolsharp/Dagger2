package com.coolsharp.dagger2.example6;

import dagger.Component;

@Component(modules = PersonModule.class)
public interface PersonComponent {
    PersonA getPersonA();

    void inject(PersonB personB);
}
