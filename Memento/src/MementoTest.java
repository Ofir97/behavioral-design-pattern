public class MementoTest {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();

        textEditor.write("Buy milk and eggs before coming home\n");

        System.out.println(textEditor.getText());

        textEditor.hitUndo();
        System.out.println("--- UNDO ---");
        System.out.println(textEditor.getText());
    }
}
