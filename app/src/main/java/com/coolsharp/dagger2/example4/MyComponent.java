package com.coolsharp.dagger2.example4;

import androidx.annotation.Nullable;

import dagger.Component;

@Component(modules = ModuleB.class) // MyComponent 인터페이스 내에는 제공할 의존성들을 메서드로 정의해야 하며 @Component에 참조된 모듈 클래스로부터 의존성을 제공받는다.
public interface MyComponent {
    @Nullable // 모듈에서 null이 허용이면 Component에서도 null 허용
    String getString(); // 프로비전 메서드, 바인드된 모듈로부터 의존성을 제공
}
