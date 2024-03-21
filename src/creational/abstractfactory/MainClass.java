package creational.abstractfactory;


import model.vehicle.Vehicle;

public class MainClass {
    public static void main(String[] args) {
        Vehicle twoWheeler = VehicleFactory.buildVehicle("TwoWheeler", 2, "Petrol");
        Vehicle fourWheeler = VehicleFactory.buildVehicle("FourWheeler", 4, "Diesel");

        System.out.println(twoWheeler);
        System.out.println(fourWheeler);
    }
}
