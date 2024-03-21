package creational.objectpool;

import creational.singleton.ReusablePool;
import model.vehicle.Vehicle;

public class MainClass {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();

        Vehicle v1 = objectPool.get();

        Vehicle v2 = objectPool.get();

        Vehicle v3 = objectPool.get();

        Vehicle v4 = objectPool.get();

        ReusablePool.getInstance().addToPool(v1);
    }
}
