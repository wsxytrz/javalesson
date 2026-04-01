package car;
public class Car{
    private String brand;
    private double price;
    public Car(){
        this.brand ="五棱hongguagn2";
        this.price =8; 
         
    }
    public Car(String brand,double price){
        this.brand = brand;
        this.price = price;
        

    }
    public String getbrand(){
        return brand;
    }
    public double getprice(){
        return price;
    }
    public void setbrand(String brand){
        this.brand=brand;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void start(){
        System.out.println("start");
    }
    public void stop(){
        System.out.println("stop");
    }
    public void display1(){
        System.out.print(brand+price);
    }
}
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