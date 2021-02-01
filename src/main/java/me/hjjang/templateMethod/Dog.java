package me.hjjang.templateMethod;

public class Dog extends Animal {

    public void playWithOwner() {
        System.out.println("귀염둥이 이리온..");
        System.out.println("멍!멍!");
    }

    @Override
    void runSomthing() {
        System.out.println("멍멍! 꼬리 살랑!");
    }

    @Override
    void play() {
        System.out.println("멍!멍!");
    }
}
