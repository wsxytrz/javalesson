public class demo02 {
    public static void main(String[] args) {
        int target=50;
        for ( int i =target+1;;i++){
            if(i %7==0){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
        System.out.println("结束循环");
    }
    
}
