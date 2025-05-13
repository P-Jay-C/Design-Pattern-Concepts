package day16.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        TrafficController controller = new TrafficController();

        Vehicle car1 = new Vehicle("Car1", controller);
        Vehicle car2 = new Vehicle("Car2", controller);
        Vehicle car3 = new Vehicle("Car3", controller);

        controller.addVehicle(car1);
        controller.addVehicle(car2);
        controller.addVehicle(car3);

        car1.requestMove("North");
        car2.requestMove("East");
    }
}