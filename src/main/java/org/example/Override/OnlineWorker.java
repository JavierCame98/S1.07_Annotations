package org.example.Override;

public class OnlineWorker extends Worker{

    private static final double FLAT_RATE_INTERNET = 25.00;

    public OnlineWorker(String name, String surname, double hourPrice){
        super(name, surname, hourPrice);
    }

    @Override
    public double calculateSalary(int hours){
        return hours * getHourPrice() + FLAT_RATE_INTERNET;
    }
}
