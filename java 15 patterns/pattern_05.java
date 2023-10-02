package patterns;
/*
Hollow Rectangle using *
* * * * *
*       *
*       *
* * * * *
*/
public class pattern_05 {
    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // i == 1 check the current row
                // i == row check the current row i is the last row
                // j == 1 check the current col
                // j == col check the current col j is the last row
                if (i == 1 || i == row ||
                        j == 1 || j == col)
                    System.out.print(" * ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
