package behavioral.command;

public class MainClass {
    public static void main(String[] args) {
        Command incrVol = new IncreaseVolumeCommand();
        Command decrVol = new DecreaseVolumeCommand();

        incrVol.execute();
        decrVol.execute();
    }
}
