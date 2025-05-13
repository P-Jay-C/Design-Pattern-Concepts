package day16.mediator;

public class Vehicle {
    private String id;
    private Mediator mediator;

    public Vehicle(String id, Mediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    public String getId() {
        return id;
    }

    public void requestMove(String direction) {
        mediator.requestMove(this, direction);
    }

    public void receiveSignal(String signal) {
        System.out.println(id + ": Received signal - " + signal);
    }
}
