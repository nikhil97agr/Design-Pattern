package creational.abstractfactory;

import model.vehicle.Vehicle;

public class VehicleFactory {

    public static Vehicle buildVehicle(String vehicleType, int tyres, String fuelType){
        Vehicle vehicle = switch (vehicleType){
            case "TwoWheeler" -> TwoWheelerFactory.buildVehicle(tyres, fuelType);
            case "FourWheeler" -> FourWheelerFactory.buildVehicle(tyres, fuelType);
            default -> null;
        };
        return vehicle;
    }
}
