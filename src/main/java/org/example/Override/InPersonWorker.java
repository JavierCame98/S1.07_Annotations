package org.example.Override;

public class InPersonWorker extends Worker{

    public static final double GASOLINE_PRICE = 60.0;

    public InPersonWorker (String name, String surname, double hourPrice){
        super(name, surname, hourPrice);
    }

    @Override
    public double calculateSalary(int hours){
        return hours * getHourPrice() + GASOLINE_PRICE;
    }

}
