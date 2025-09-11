package poly.driver;



public class K3 implements Car {

    private String driver;
    private int fuel;

    public K3(String driver, int fuel) {
        this.driver = driver;
        this.fuel = fuel;
    }


    @Override
    public void enginStart() {
        System.out.println("엔진 스타트" + driver + ", fuel :" + fuel);
    }

    @Override
    public void enginStop() {
        System.out.println("엔진 종료");
    }

    @Override
    public void driveCar() {
        System.out.println("운전중");
    }
}
