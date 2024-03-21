package model.vehicle;

public interface Vehicle {

    void setTyres(int tyres);

    void setFuelType(String fuelType);

    void blowHorn();

    Vehicle cloneVehicle();

}
