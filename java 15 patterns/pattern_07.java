package patterns;
// Inverted Half Pyramid With Numbers

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class pattern_07 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
