package behavioral.command;

public class DecreaseVolumeCommand implements Command {
    Remote remote;

    public DecreaseVolumeCommand(){
        remote = new Remote();
    }

    public void execute(){
        remote.decreaseVolume();
    }
}
