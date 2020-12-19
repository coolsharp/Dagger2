package com.coolsharp.dagger2.example3;

/**
 * 컴퓨터 클래스
 */
public class Computer {
    // CPU 인터페이스 타입 멤버 변수 생성
    private Cpu cpu;

    // 생성자이며 인자를 CPU 인터페이스 타입으로 받음
    // 제어의 역전을 통해 Computer 의존성을 해제
    public Computer(Cpu cpu) {
        this.cpu = cpu;
    }

    // setter
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
