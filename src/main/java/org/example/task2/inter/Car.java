package org.example.task2.inter;

public class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("Car drives..");
    }

    @Override
    public void stop() {
        System.out.println("Car stops.");
    }
}
