package model.manufacturer;

import model.workshop.Workshop;

public abstract class VehicleManufacturer {

    Workshop producer;
    Workshop assembler;

    protected  VehicleManufacturer(Workshop producer, Workshop assembler){
        this.producer = producer;
        this.assembler = assembler;
    }

    public abstract void manufacture();
}
