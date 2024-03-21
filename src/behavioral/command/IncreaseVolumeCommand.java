package behavioral.command;

public class IncreaseVolumeCommand implements  Command{
    Remote remote;

    public IncreaseVolumeCommand(){
        remote = new Remote();
    }
    public void execute(){
        remote.increaseVolume();
    }
}
