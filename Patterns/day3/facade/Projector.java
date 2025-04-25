package day3.facade;

public class Projector {
    public void on(){
        System.out.println("Projector is on");
    }

    public void setInput(String input){
        System.out.println("Projector input set to: " + input);
    }

    public void off(){
        System.out.println("Projector is off");
    }

}
