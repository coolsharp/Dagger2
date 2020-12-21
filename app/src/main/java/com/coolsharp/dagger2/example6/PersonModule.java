package com.coolsharp.dagger2.example6;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {
    @Provides
    String provideName() {
        return "Charles";
    }
    @Provides
    int provideAge() {
        return 100;
    }
}
