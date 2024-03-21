package creational.factory;

import creational.builder.FourWheelerBuilder;
import creational.builder.TwoWheelerBuilder;
import model.vehicle.Vehicle;

public class VehicleFactory {

    public static Vehicle buildVehicle(String vehicleType, int tyres, String fuelType){
        Vehicle vehicle = switch (vehicleType) {
            case "TwoWheeler" -> new TwoWheelerBuilder().setTyres(tyres).setFuelType(fuelType).build();
            case "FourWheeler" -> new FourWheelerBuilder().setTyres(tyres).setFuelType(fuelType).build();
            default -> null;
        };

        return vehicle;
    }
}
