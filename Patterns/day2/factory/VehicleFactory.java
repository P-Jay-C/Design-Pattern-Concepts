package day2.factory;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void driveVehicle(){
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }

}
