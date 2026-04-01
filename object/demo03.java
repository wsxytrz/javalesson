public class demo03 {
    public static void main(String[] args) {
        int [][] b={{1,2},{3,4},{5,6}};
        int rows=3;
        int column=2;
        int [][] c= new int[rows][column];
        for (int i=0; i <rows;i++){
            for (int j=0; j<column;j++){
                c[i][j]=b[i][j]*2;
                if((i==0 ) || (i==1))
                    System.out.print(c[i][j]+ "  ");
                else 
                    System.out.print(c[i][j]+ " ");

            }
              System.out.println();
        }
        

    }
    
}
