package day3.command;

public class WriteCommand implements Command{

    private TextEditor textEditor;
    private  String text;
    public WriteCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.write(text);
    }
}
