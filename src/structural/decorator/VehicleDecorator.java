package structural.decorator;

import model.vehicle.Vehicle;

public class VehicleDecorator implements Vehicle {
    private Vehicle vehicle;
    private String vehicleColor;

    public VehicleDecorator(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void paint(String color){
        this.vehicleColor = color;
    }

    @Override
    public void setTyres(int tyres) {
        vehicle.setTyres(tyres);
    }

    @Override
    public void setFuelType(String fuelType) {
        vehicle.setFuelType(fuelType);
    }

    @Override
    public void blowHorn() {
        vehicle.blowHorn();
    }

    @Override
    public Vehicle cloneVehicle() {
        return vehicle.cloneVehicle();
    }

    @Override
    public String toString() {
        return "VehicleDecorator{" +
                "vehicle=" + vehicle +
                ", vehicleColor='" + vehicleColor + '\'' +
                '}';
    }
}
