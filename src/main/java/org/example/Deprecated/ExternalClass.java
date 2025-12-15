package org.example.Deprecated;

public class ExternalClass {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        OnlineWorker Ramon = new OnlineWorker("Ramon", "Pagan", 25);
        InPersonWorker Javi = new InPersonWorker("Javi", "Castillo", 35);

        System.out.println(Ramon.deprecatedCalculateSalary(78));
        System.out.println(Javi.deprecatedCalculateSalary(80));
    }

}
