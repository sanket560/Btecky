package patterns;
/*
Palindromic Pattern with Numbers
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/
public class pattern_15 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){

            for (int j=5; j>=i; j--){
                System.out.print("   ");
            }

            int decreasing  = i;
            for (int j=i; j>=1; j--){
                System.out.print(decreasing  + "  ");
                decreasing --;
            }

            int increasing  = 2;
            for (int j=2; j<=i; j++){
                System.out.print(increasing  + "  ");
                increasing  ++;
            }
            System.out.println();
        }
    }
}
