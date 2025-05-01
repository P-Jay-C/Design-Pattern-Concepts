package day8.momento;

public class MomentoTest {
    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        History history = new History();

        document.setContent("Version 1");
        history.save(document.save());
        System.out.println("Current Content: " + document.getContent());

        document.setContent("Version 2");
        history.save(document.save());
        System.out.println("Current Content: " + document.getContent());

        document.setContent("Version 3");
        System.out.println("Current Content: " + document.getContent());

        // Restore to previous version
        Momento momento = history.undo();
        if (momento != null) {
            document.restore(momento);
            System.out.println("Undo to: " + document.getContent());
        }

        momento = history.undo();
        if (momento != null) {
            document.restore(momento);
            System.out.println("Undo to: " + document.getContent());
        }

        momento = history.undo();
        if(momento != null){
            document.restore(momento);
            System.out.println("Undo to: " + document.getContent());
        }

    }
}
