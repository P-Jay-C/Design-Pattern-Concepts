package day3.command;

import java.util.Stack;

// TextEditor receiver
public class TextEditor {
    private StringBuilder content  = new StringBuilder();
    private Stack<String> history = new Stack<>();

    public void write(String text){
        history.push(content.toString());
        content.append(text);
        System.out.println("Content: " + content);
    }

    public void undo(){
        if(!history.empty()){
            content = new StringBuilder(history.pop());
            System.out.println("Undo - Content: " + content);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public String getContent(){
        return content.toString();
    }

}
