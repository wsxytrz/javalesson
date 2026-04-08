import  fcar.car;
class ecar extends car{
    public ecar(String brand,double price){
        super(brand,price);
    }
    public void charge(){
        System.out.println(getbrand()+"充电中");
    }

}
class gcar extends car{
    public gcar(String brand,double price){
        super(brand,price);
    }
    public void refuel(){
        System.out.println(getbrand()+"加油中");
    }

}
public class demo05{
    public static void main(String[] args) {
        ecar myEcar =new ecar("蔚来",38.8);
        myEcar.displaycar();
        myEcar.start();
        myEcar.charge();
        myEcar.stop();
        System.out.println();
   
        gcar myGcar =new gcar("吉利",18);
        myGcar.displaycar();
        myGcar.start();
        myGcar.refuel();
        myGcar.stop();
        System.out.println();
        
    }
}