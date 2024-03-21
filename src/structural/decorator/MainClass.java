package structural.decorator;

import model.vehicle.FourWheeler;
import model.vehicle.TwoWheeler;
import model.vehicle.Vehicle;

public class MainClass {
    public static void main(String[] args) {
        Vehicle twoWheeler = new TwoWheeler();

        VehicleDecorator twoWheelerDecorator = new VehicleDecorator(twoWheeler);

        twoWheelerDecorator.setTyres(2);
        twoWheelerDecorator.setFuelType("Petrol");
        twoWheelerDecorator.paint("RED");


        Vehicle fourWheeler = new FourWheeler();

        VehicleDecorator fourWheelerDecorator = new VehicleDecorator(fourWheeler);

        fourWheelerDecorator.setTyres(4);
        fourWheelerDecorator.setFuelType("Diesel");
        fourWheelerDecorator.paint("BLUE");

        System.out.println(twoWheelerDecorator);
        System.out.println(fourWheelerDecorator);
    }
}
