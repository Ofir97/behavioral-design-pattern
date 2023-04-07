package devices;
// Each command you want to issue will implement
// the Command interface

public interface Command {
    void execute();
    void undo();
}
