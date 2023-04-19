package org.example.task2.inter;

public class Human {

    private Transport safetransport;

    public void stop(){
        if (safetransport != null) {
            safetransport.stop();
            safetransport = null;
        } else {
            System.out.println("не движемся.");
        }
    }
    public void drive(Transport transport) { // пишем что принимаем транспорт, по сути принимаем любой транспорт (машина, велосипед..)
        transport.drive(); // для какого класса вызовется этот метод
        // поэтому если в интерфейс попадет класс машина, выполнится драйв для машины и тд
        safetransport = transport;
    }
    // более универсальный алгоритм, можем создать сколько угодно траспортов и переписывать ничего не нужно
}
