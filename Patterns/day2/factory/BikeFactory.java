package day2.factory;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike() ;
    }
}
