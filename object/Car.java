public class Car {
    private String brand;
    private double price;

    public Car() {
        this.brand = "五菱宏光";
        this.price = 8;
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {
        Car defaultCar = new Car();      // 变量名改为 defaultCar
        defaultCar.display();

        Car myCar = new Car("比亚迪", 20.1);
        myCar.display();
        myCar.start();
        myCar.stop();
    }
}
