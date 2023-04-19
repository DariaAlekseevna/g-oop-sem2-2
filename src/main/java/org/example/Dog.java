package org.example;

public class Dog extends Animal {

    static int count;

    public Dog(Integer runDist, Integer swimDist, String name, String typeOfAnimals) {
        super(runDist, swimDist, name, typeOfAnimals);
        count++;
    }

    @Override
    void swim(Integer dist) {
        if (dist>swimDist) {
            System.out.println(name + " не доплыл");
        } else {
            System.out.println(name + " доплыл " + dist);
        }
    }
}
