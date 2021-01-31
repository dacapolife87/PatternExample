package me.hjjang.adapterPattern.src;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb2 = new AdapterServiceB();

        asa1.runService();
        asb2.runService();
    }
}
