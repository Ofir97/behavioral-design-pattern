/**
 * Originator
 */
public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState savedState) {
        currentText = new StringBuilder(savedState.getText());
    }

    public StringBuilder getText() {
        return currentText;
    }
}
