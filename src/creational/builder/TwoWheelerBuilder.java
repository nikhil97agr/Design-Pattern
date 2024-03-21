package creational.builder;

import model.vehicle.TwoWheeler;
import model.vehicle.Vehicle;

public class TwoWheelerBuilder implements  VehicleBuilder{
    Vehicle vehicle;
    public TwoWheelerBuilder() {
        vehicle = new TwoWheeler();
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
