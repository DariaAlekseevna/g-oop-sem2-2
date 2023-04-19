package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Human person = new Human();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        person.drive(car);
        person.drive(bicycle);
        person.drive(new Board());
        person.stop(); // останавливает сразу все средства
        person.stop(); // этот уже не нужен
    }



}
