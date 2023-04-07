package devices;

import java.util.List;

public class TurnItAllOff implements Command{

    List<ElectronicDevice> electronicDevices;

    public TurnItAllOff(List<ElectronicDevice> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : electronicDevices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : electronicDevices) {
            device.on();
        }
    }
}
