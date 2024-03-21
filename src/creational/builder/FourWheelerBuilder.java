package creational.builder;

import model.vehicle.FourWheeler;
import model.vehicle.Vehicle;

public class FourWheelerBuilder implements  VehicleBuilder{
    Vehicle vehicle;
    public FourWheelerBuilder() {
        vehicle = new FourWheeler();
    }

    @Override
    public VehicleBuilder setTyres(int tyres) {
        this.vehicle.setTyres(tyres);
        return this;
    }

    @Override
    public VehicleBuilder setFuelType(String fuelType) {
        this.vehicle.setFuelType(fuelType);
        return this;
    }

    @Override
    public Vehicle build() {
        return vehicle;
    }
}
