package model.vehicle;

public class FourWheeler implements Vehicle{
    int tyres;
    String fuelType;

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
    public Vehicle cloneVehicle() {
        return (Vehicle)this.clone();
    }

    @Override
    public void blowHorn(){
        System.out.println("Four wheeler horn.............");
    }

    @Override
    protected  Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "FourWheeler{" +
                "tyres=" + tyres +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
