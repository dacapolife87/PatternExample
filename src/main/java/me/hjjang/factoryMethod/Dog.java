package me.hjjang.factoryMethod;

public class Dog extends Animal {
    AnimalToy getToy() {
        return new DogToy();
    }
}
