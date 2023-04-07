package devices;

public class TurnTVOn implements Command {

    private ElectronicDevice electronicDevice;

    public TurnTVOn(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }

    @Override
    public void undo() {
        electronicDevice.off();
    }
}
