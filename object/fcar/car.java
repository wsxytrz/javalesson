package fcar;
public class car{
    private String brand;
    private double price;
    public car(){
        this.brand ="五棱宏光";
        this.price =8; 
         
    }
    public car(String brand,double price){
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
    public void displaycar(){
        System.out.print(brand+price);
    }
}


