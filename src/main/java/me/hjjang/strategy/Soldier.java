package me.hjjang.strategy;

public class Soldier {
    void runContext(Strategy strategy) {
        System.out.println("전투시작");
        strategy.runStrategy();
        System.out.println("전투종료");
    }
}
