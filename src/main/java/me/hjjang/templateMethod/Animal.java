package me.hjjang.templateMethod;

public abstract class Animal {
    
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온");
        play();
        runSomthing();
        System.out.println("잘했어");
    }

    void runSomthing() {
        System.out.println("꼬리 살랑 살랑~!");
    };

    abstract void play();
}
