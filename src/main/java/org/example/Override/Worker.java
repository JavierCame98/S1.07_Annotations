package org.example.Override;

public abstract class Worker {

    private String name;
    private String surname;
    private double hourPrice;

    public Worker (String name, String surname, double hourPrice){
        this.name = name;
        this.surname = surname;
        this.hourPrice = hourPrice;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public double calculateSalary(int hours){
        if(hours < 0){
            throw new IllegalArgumentException("The hours must be positive");
        }
        return hours * hourPrice;
    }
}
