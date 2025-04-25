package day3.command;

public class CommandText {
    public static void main(String[] args){
        TextEditor  editor = new TextEditor();

        Command write1 = new WriteCommand(editor, "Hello");
        Command write2 = new WriteCommand(editor, ", World!");

        Command undo = new UndoCommand(editor);

        write1.execute();
        write2.execute();

        undo.execute();
        undo.execute();
    }
}
