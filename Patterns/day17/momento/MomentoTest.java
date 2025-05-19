package day17.momento;

public class MomentoTest {
    public static void main(String[] args) {
        GameState game = new GameState();
        GameCaretaker caretaker = new GameCaretaker();

        game.setState(100,1);
        caretaker.save(game);

        game.setState(200,2);
        caretaker.save(game);

        game.setState(300,3);

        System.out.println("\nUndoing last state: ");
        caretaker.undo(game);

        System.out.println("\nUndoing another state: ");
        caretaker.undo(game);

    }
}
