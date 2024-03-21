package creational.objectpool;

import creational.singleton.ReusablePool;
import model.vehicle.TwoWheeler;
import model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {
    private List<Vehicle> twoWheelerVehicleObjects;
    private ReusablePool reusablePool;
    public ObjectPool(){
        twoWheelerVehicleObjects = new ArrayList<>();
        reusablePool = ReusablePool.getInstance();
        for(int i=0;i<3;i++){
            twoWheelerVehicleObjects.add(new TwoWheeler());
        }
    }

    public Vehicle get(){
        try{
            if(this.twoWheelerVehicleObjects.isEmpty()){
                return reusablePool.get();
            }else{
                return this.twoWheelerVehicleObjects.remove(0);
            }
        }catch (ObjectPoolEmptyException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
