package creational.builder;

import model.vehicle.Vehicle;

public class MainClass {
    public static void main(String[] args) {
        Vehicle twoWheeler = new TwoWheelerBuilder().setTyres(2).setFuelType("Petrol").build();
        Vehicle fourWheeler = new FourWheelerBuilder().setTyres(4).setFuelType("Diesel").build();

        System.out.println(twoWheeler);
        System.out.println(fourWheeler);
    }
}
