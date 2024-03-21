package model.vehicle;

public class TwoWheeler implements Vehicle, Cloneable{
    private int tyres;
    private String fuelType;

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "tyres=" + tyres +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public Vehicle cloneVehicle(){
        return (Vehicle)this.clone();
    }


    @Override
    public void blowHorn(){
        System.out.println("Two wheeler horn.............");
    }

    @Override
    protected Object clone(){

        Object clone = null;
        try{

            clone = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();;
        }
        return clone;

    }

    @Override
    public boolean equals(Object obj) {
        TwoWheeler twoWheeler = (TwoWheeler) obj;

        return tyres == twoWheeler.getTyres() && fuelType.equals(twoWheeler.getFuelType());
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
}
