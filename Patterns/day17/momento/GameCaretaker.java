package day17.momento;

import java.util.Stack;

public class GameCaretaker {
    private Stack<GameState.Momento> history = new Stack<>();

    public void save(GameState state){
        history.push(state.save());
    }

    public void undo(GameState state){
        if(!history.isEmpty()){
           state.restore(history.pop());
        } else {
            System.out.println("No states to restore.");
        }
    }
}
