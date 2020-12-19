package com.coolsharp.dagger2.example2;

/**
 * 컴퓨터 클래스
 */
public class Computer {
    // CPU 인터페이스 타입 멤버 변수 생성
    private Cpu cpu;

    // 생성자이며 인자를 CPU 인터페이스 타입으로 받음
    public Computer() {
        cpu = new IntelCpu();
    }
}
