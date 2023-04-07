package devices;

public class TurnTVDown implements Command{

    private ElectronicDevice electronicDevice;

    public TurnTVDown(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }

    @Override
    public void undo() {
        electronicDevice.volumeUp();
    }
}
