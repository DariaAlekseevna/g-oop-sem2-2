package org.example;

public abstract class Animal {
    Integer runDist;
    Integer swimDist;
    String name;
    String typeOfAnimals;
    static int count;

    abstract void swim(Integer dist);
    void run(Integer dist) {
        if (dist>runDist) {
            System.out.println(name + " не добежал");
        } else {
            System.out.println(name + " пробежжал " + dist);
        }
    }

    public Animal(Integer runDist, Integer swimDist, String name, String typeOfAnimals) {
        this.runDist = runDist;
        this.swimDist = swimDist;
        this.name = name;
        this.typeOfAnimals = typeOfAnimals;
        count++;
    }
}
