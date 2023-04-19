package org.example.task2;

//6) Создать класс человек с возможностью ездить и останавливаться на: машине, скейтборде,велосипеде
// (что будет если расширить список ?).
public class Human {
    private  Car safecar;
    private Board safeboard;
    private Bicycle safebicycle;
    void drive(Car car) {
        car.ride();
        safecar = car;
    }
    void drive(Board board) {
        board.ride();
        safeboard = board;
    }
    void drive(Bicycle bicycle) {
        bicycle.ride();
        safebicycle = bicycle;
    }
    void stop() {
        if (safecar != null) {
            safecar.stop();
            safecar = null;
        }
        if (safeboard != null) {
            safeboard.stop();
            safeboard = null;
        }
        if (safebicycle != null) {
            safebicycle.stop();
            safebicycle = null;
        }
    }

}
