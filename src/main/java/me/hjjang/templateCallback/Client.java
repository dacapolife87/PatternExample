package me.hjjang.templateCallback;

public class Client {

    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("총총총!!!!");

        System.out.println();

        rambo.runContext("칼칼칼!!!");

        System.out.println();

        rambo.runContext("활활활!!!");
    }
}
