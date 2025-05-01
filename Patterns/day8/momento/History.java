package day8.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Momento> momentos = new ArrayList<>();
    private int currentIndex = -1;

    public void save(Momento momento){
        // clear future states if saving after undo
         while(momentos.size() > currentIndex + 1) {
             momentos.remove(momentos.size() - 1);
         }

        // add new state
        momentos.add(momento);
        currentIndex++;
    }

    public Momento undo() {

        if(currentIndex >= 0){
            currentIndex--;
            return momentos.get(currentIndex + 1);
        }
        return null; // No more states to undo
    }

    public Momento redo(){
        if(currentIndex + 1 < momentos.size()){
            currentIndex++;
            return momentos.get(currentIndex);
        }
        return null; // No more states to redo
    }


}
