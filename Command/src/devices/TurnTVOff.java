package devices;

public class TurnTVOff implements Command{

    private ElectronicDevice electronicDevice;

    public TurnTVOff(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }

    @Override
    public void undo() {
        electronicDevice.on();
    }
}
