package org.example.task2.inter;


public class Bicycle implements Transport {
    @Override
    public void drive() {
        System.out.println("bicycle rides.");
    }

    @Override
    public void stop() {
        System.out.println("bicycle stops.");
    }
}
