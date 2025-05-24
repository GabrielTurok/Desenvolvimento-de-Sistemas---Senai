package FOR_e_DoWhile;

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String n = sc.nextLine();

        int t = n.length();

        for (int i = t - 1; i >= 0; i--){
            System.out.println(n.charAt(i) + " ");
        }
        sc.close();
    }
}
