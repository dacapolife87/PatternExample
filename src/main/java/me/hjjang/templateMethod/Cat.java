package me.hjjang.templateMethod;

public class Cat extends Animal {

//    public void playWithOwner() {
//        System.out.println("귀염둥이 이리온..");
//        System.out.println("야용~! 야옹~!");
//    }

    @Override
    void play() {
        System.out.println("야옹~ 야옹~");
    }

    @Override
    void runSomthing() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~~");
    }
}
