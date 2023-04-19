package org.example;

public class HomeCat extends Cat {

    static int count;

    public HomeCat(Integer runDist, Integer swimDist, String name, String typeOfAnimals) {
        super(runDist, swimDist, name, typeOfAnimals);
        count++;
    }

    @Override
    void swim(Integer dist) {
        System.out.println(name + " не способен проплыть дистанцию " + dist);
    }
}
