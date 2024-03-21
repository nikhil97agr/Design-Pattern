package creational.builder;

import model.vehicle.Vehicle;

public interface VehicleBuilder {

    public VehicleBuilder setTyres(int tyres);
    public VehicleBuilder setFuelType(String fuelType);

    public Vehicle build();

}
