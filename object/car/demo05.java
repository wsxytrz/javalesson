package car;
public class demo05 {
    public static void main(String[] args) {
        Car default =new Car();
        default.display1();
        Car mycar = new Car("比亚迪",20.1);
        mycar.display1();
        mycar.start();
        mycar.stop();
    }
}