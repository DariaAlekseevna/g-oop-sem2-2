package org.example.task2.inter;


public class Main {
    public static void main(String[] args) {

        Human person = new Human();
        Bicycle bicycle = new Bicycle();
        person.stop();
        person.drive(bicycle);
        person.stop();

        // с помощью интерфейса быстро и бесшовно можем добавлять новые сущности
        Motobike moto = new Motobike();
        person.drive(moto);
    }
}
