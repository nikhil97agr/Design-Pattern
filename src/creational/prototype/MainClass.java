package creational.prototype;

import creational.builder.FourWheelerBuilder;
import creational.builder.TwoWheelerBuilder;
import model.vehicle.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Set<Vehicle> vehicles = new HashSet<>();

        Vehicle twoWheeler = new TwoWheelerBuilder().setTyres(2).setFuelType("Petrol").build();

        vehicles.add(twoWheeler);
        System.out.println(vehicles.size());

        twoWheeler = twoWheeler.cloneVehicle();
        vehicles.add(twoWheeler);
        System.out.println(vehicles.size());

        Vehicle fourWheeler = new FourWheelerBuilder().setTyres(4).setFuelType("Diesel").build();
        vehicles.add(fourWheeler);

        System.out.println(vehicles.size());

        fourWheeler = fourWheeler.cloneVehicle();
        vehicles.add(fourWheeler);

        System.out.println(vehicles.size());


    }
}
