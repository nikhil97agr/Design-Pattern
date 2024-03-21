package creational.singleton;

import creational.objectpool.ObjectPoolEmptyException;
import model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ReusablePool {

    private static ReusablePool reusablePool;
    private List<Vehicle> twoWheelerObjectPool;

    private ReusablePool(){
        twoWheelerObjectPool = new ArrayList<>();
    }

    public List<Vehicle> getTwoWheelerObjectPool() {
        return twoWheelerObjectPool;
    }

    public void setTwoWheelerObjectPool(List<Vehicle> twoWheelerObjectPool) {
        this.twoWheelerObjectPool = twoWheelerObjectPool;
    }

    public static ReusablePool getInstance(){
        if(reusablePool == null){
            reusablePool = new ReusablePool();
        }

        return reusablePool;
    }

    public void addToPool(Vehicle vehicle){
        this.twoWheelerObjectPool.add(vehicle);
    }

    public Vehicle get() throws ObjectPoolEmptyException {
        if(this.twoWheelerObjectPool.isEmpty()){
            throw new ObjectPoolEmptyException("Pool is empty");
        }else{
            return this.twoWheelerObjectPool.remove(0);
        }
    }
}
