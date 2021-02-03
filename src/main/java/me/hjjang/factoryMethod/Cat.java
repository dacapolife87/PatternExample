package me.hjjang.factoryMethod;

public class Cat extends Animal {
    AnimalToy getToy() {
        return new CatToy();
    }
}
