package org.example.task2.inter;

public class Motobike implements Transport {
    @Override
    public void drive() {
        System.out.println("Motorbike drives....");
    }

    @Override
    public void stop() {
        System.out.println("Motorbike stops.)");
    }
}
