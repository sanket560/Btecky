package patterns;
/*
Diamond pattern

     *
    * *
   * * *
  * * * *
   * * *
    * *
     *
*/
public class pattern_13 {
    public static void main(String[] args) {
          int row = 4;
          for (int i=1; i<=row; i++){
              for (int j=4; j>=i; j--){
                  System.out.print(" ");
              }
              for (int j=1; j<=i; j++){
                  System.out.print("* ");
              }
              System.out.println();
          }
          for (int i=1; i<=3; i++){
              for (int j=4; j>=row-i; j--){
                  System.out.print(" ");
              }
              for (int j=3; j>=i; j--){
                  System.out.print("* ");
              }
              System.out.println();
          }
    }
}
