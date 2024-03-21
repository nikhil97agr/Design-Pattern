package structural.bridge;

import model.manufacturer.FourWheelerManufacturer;
import model.manufacturer.TwoWheelerManufacturer;
import model.manufacturer.VehicleManufacturer;
import model.workshop.Assemble;
import model.workshop.Produce;

public class MainClass {

    public static void main(String[] args) {
        VehicleManufacturer twoWheeler = new TwoWheelerManufacturer(new Produce(), new Assemble());
        VehicleManufacturer fourWheeler = new FourWheelerManufacturer(new Produce(), new Assemble());

        twoWheeler.manufacture();
        fourWheeler.manufacture();
    }


}
