package cornerstone;

public class Demo01 {
    public static void main(String[] args) throws Exception {
      int x=15;
      int y=4;
      double z=5.5;
      int division =x/y;
      int modulus =x%y;
      double flaotMod =z%y;
      int preInc =++x;
      int postDec =y--;
      System.out.println("x:"+(x-1)+" y:"+(y+1)+" z:"+z);
      System.out.println(division);
      System.out.println(modulus);
      System.out.println(flaotMod);
      System.out.println(preInc);
      System.out.println(postDec);
    }
}