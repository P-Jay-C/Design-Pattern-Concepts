package day3.command;

public class UndoCommand implements Command {
    private final TextEditor textEditor;

    public UndoCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.undo();
    }
}
