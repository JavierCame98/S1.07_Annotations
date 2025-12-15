package org.example.Override;

public class Main {

    public static void main(String[] args) {


        OnlineWorker oW1 = new OnlineWorker("Javi", "Castillo", 15);
        InPersonWorker iPW1 = new InPersonWorker("Ramon", "Pagan", 20);


        System.out.println( oW1.calculateSalary(40));
        System.out.println(iPW1.calculateSalary(40));

    }
}
