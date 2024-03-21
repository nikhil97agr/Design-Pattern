package structural.facade;

import creational.factory.VehicleFactory;
import model.vehicle.Vehicle;

public class Showroom {

    public Vehicle getTwoWheeler(){
        return VehicleFactory.buildVehicle("TwoWheeler", 2, "Petrol");
    }

    public Vehicle getFourWheeler(){
        return VehicleFactory.buildVehicle("FourWheeler", 4, "Diesel");
    }
}
