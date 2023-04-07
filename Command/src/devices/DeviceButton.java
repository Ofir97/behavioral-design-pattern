package devices;
// This is known as the invoker
// It has a method press() that when executed
// causes the execute method to be called

// The execute method for the Command interface then calls 
// the method assigned in the class that implements the
// Command interface

public class DeviceButton {

    private Command command;

    public DeviceButton(Command newCommand) {
        this.command = newCommand;
    }

    public void press() {
        command.execute();
    }

    // Now the remote can undo past commands
    public void pressUndo() {
        command.undo();
    }
}