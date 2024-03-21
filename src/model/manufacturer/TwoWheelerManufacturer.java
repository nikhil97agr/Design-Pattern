package model.manufacturer;

import model.workshop.Workshop;

public class TwoWheelerManufacturer extends  VehicleManufacturer{

    public TwoWheelerManufacturer(Workshop producer, Workshop assembler){
        super(producer, assembler);
    }
    @Override
    public void manufacture() {
        System.out.println("Manufacturing bikes..........");
        producer.work();
        assembler.work();
    }
}
