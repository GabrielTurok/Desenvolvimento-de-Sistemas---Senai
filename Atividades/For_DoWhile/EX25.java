package FOR_e_DoWhile;

import java.util.Scanner;

public class EX25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            for (int e = 0; e <= i; e++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
