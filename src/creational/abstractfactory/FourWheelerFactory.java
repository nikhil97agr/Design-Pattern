package creational.abstractfactory;

import creational.builder.TwoWheelerBuilder;
import model.vehicle.Vehicle;

public class FourWheelerFactory {

    public static Vehicle buildVehicle(int tyres, String fuelType){
        Vehicle vehicle = new TwoWheelerBuilder().setTyres(tyres).setFuelType(fuelType).build();

        return vehicle;
    }
}
