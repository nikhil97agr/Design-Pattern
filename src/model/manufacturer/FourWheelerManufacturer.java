package model.manufacturer;

import model.workshop.Workshop;

public class FourWheelerManufacturer extends  VehicleManufacturer{

    public FourWheelerManufacturer(Workshop producer, Workshop assembler){
        super(producer, assembler);
    }
    @Override
    public void manufacture() {
        System.out.println("Manufacturing cars..........");
        producer.work();
        assembler.work();
    }
}
