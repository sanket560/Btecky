package patterns;
/*
Alphabet Triangle
A
B C
D E F
G H I J
*/
public class pattern_04 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
