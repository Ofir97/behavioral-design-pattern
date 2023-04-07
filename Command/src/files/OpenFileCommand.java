package files;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        fileSystem.openFile();
    }
}
