import java.util.Scanner;

public class bioskop20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] penonton = new String[4][2];

        penonton [0][0] = "Amin";
        penonton [0][1] = "Bena";
        penonton [1][0] = "Caca";
        penonton [1][1] = "Danu";
        penonton [2][0] = "Erga";
        penonton [2][1] = "Fara";
        penonton [3][0] = "Gani";

        System.out.printf("%s \t %s\n",penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n",penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n",penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n",penonton[3][0], penonton[3][1]);
        
    }
}