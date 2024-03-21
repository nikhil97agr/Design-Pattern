package structural.adapter;

import model.sound.MusicSound;
import model.sound.Sound;
import model.vehicle.FourWheeler;
import model.vehicle.TwoWheeler;
import model.vehicle.Vehicle;

public class MainClass {
    public static void main(String[] args) {
        Vehicle twoWheeler = new TwoWheeler();
        Vehicle fourWheeler = new FourWheeler();

        Sound music = new MusicSound();

        Sound twoWheelerSound  = new VehicleSoundAdapter(twoWheeler);
        Sound fourWheelerSound = new VehicleSoundAdapter(fourWheeler);

        music.makeSound();
        twoWheelerSound.makeSound();
        fourWheelerSound.makeSound();
    }
}
