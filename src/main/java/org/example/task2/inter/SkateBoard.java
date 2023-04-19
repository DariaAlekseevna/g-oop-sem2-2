package org.example.task2.inter;

public class SkateBoard implements Transport {
    @Override
    public void drive() {
        System.out.println("SkateBoard rides..");
    }

    @Override
    public void stop() {
        System.out.println("SkateBoard stops.");
    }
}
