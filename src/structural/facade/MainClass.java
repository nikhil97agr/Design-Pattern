package structural.facade;

import model.vehicle.Vehicle;

public class MainClass {

    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        Vehicle twoWheeler = showroom.getTwoWheeler();

        Vehicle fourWheeler = showroom.getFourWheeler();

        System.out.println(twoWheeler);
        System.out.println(fourWheeler);
    }

}
