package FOR_e_DoWhile;

import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String n = sc.nextLine();

        for (int i = 0; i < n.length(); i++){
            System.out.println(n.charAt(i) + " ");
        }
        sc.close();
    }
}
