package com.coolsharp.dagger2.example1;

public class Computer {
    // CPU 클래스를 선언
    private IntelCpu intelCpu;

    // 생성자
    public Computer() {
        // CPU 클래스 생성
        intelCpu = new IntelCpu();
    }
}
