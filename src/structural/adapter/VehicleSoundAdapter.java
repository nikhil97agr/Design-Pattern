package structural.adapter;

import model.sound.Sound;
import model.vehicle.Vehicle;

public class VehicleSoundAdapter implements Sound {
    private Vehicle vehicle;

    public VehicleSoundAdapter(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void makeSound() {
        vehicle.blowHorn();
    }



}
