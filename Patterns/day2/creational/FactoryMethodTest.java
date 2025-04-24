package day2.creational;

public class FactoryMethodTest {
    public static void main(String[] args){
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();

        carFactory.createVehicle();
        bikeFactory.createVehicle();

        carFactory.driveVehicle();
        bikeFactory.driveVehicle();
    }
}
