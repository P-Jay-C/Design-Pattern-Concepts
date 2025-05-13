package day16.mediator;

import java.util.ArrayList;
import java.util.List;

public class TrafficController implements Mediator{
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    @Override
    public void requestMove(Vehicle vehicle, String direction) {
        System.out.println("TrafficController: Processing request from " + vehicle.getId() + " to move " + direction);

        for(Vehicle v : vehicles){
            if(v != vehicle){
                v.receiveSignal("Wait: " + vehicle.getId() + " is moving " + direction);            }
        }
        vehicle.receiveSignal("Go: Move " + direction);
    }
}
