package poly.driver;

public class Driver {
    private Car car;

    public Driver(Car car) {
        this.car = car;
    }


    void start(){
        car.enginStart();
    }
    void stop(){
        car.enginStop();
    }
    void drive(){
        car.driveCar();
    }


}
