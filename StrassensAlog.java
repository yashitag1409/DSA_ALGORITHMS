public class StrassensAlog {
   public static void main(String[] args) {
      int[][] x = {{1 , 5}, {3 , 8}};
      int[][] y = {{7 , 4}, {6, 2}};
      int z[][] = new int[2][2];
      int m1, m2, m3, m4 , m5, m6, m7;
      

      System.out.print("The first matrix is: ");
      for(int i = 0; i<2; i++) {
         System.out.println();//new line
         for(int j = 0; j<2; j++) {
            System.out.print(x[i][j] + " ");
         }
      }
      System.out.print("\nThe second matrix is: ");
      for(int i = 0; i<2; i++) {
         System.out.println();//new line
         for(int j = 0; j<2; j++) {
            System.out.print(y[i][j] + " ");
         }
      }
      m1 = (x[0][0] + x[1][1]) * (y[0][0] + y[1][1]);
      m2 = (x[1][0] + x[1][1]) * y[0][0];
      m3 = x[0][0] * (y[0][1] - y[1][1]);
      m4 = x[1][1] * (y[1][0] - y[0][0]);
      m5 = (x[0][0] + x[0][1]) * y[1][1];
      m6 = (x[1][0] - x[0][0]) * (y[0][0]+y[0][1]);
      m7 = (x[0][1] - x[1][1]) * (y[1][0]+y[1][1]);

        z[0][0] = m1 + m4- m5 + m7;
        z[0][1] = m3 + m5;
        z[1][0] = m2 + m4;
        z[1][1] = m1 - m2 + m3 + m6;
    
      System.out.print("\nProduct achieved using Strassen's algorithm: ");
      for(int i = 0; i<2; i++) {
         System.out.println();//new line
         for(int j = 0; j<2; j++) {
            System.out.print(z[i][j] + " ");
         }
      }
   }
}