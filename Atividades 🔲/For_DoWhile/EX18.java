package FOR_e_DoWhile;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma palavra: ");
    String input = sc.nextLine();

    boolean Palindrome = true;
    int t = input.length();

        for (int i = 0; i < t / 2; i++) {
        if (input.charAt(i) != input.charAt(t - 1 - i)) {
            Palindrome = false;
            break;
        }
    }

        if (Palindrome) {
        System.out.println("A string é um palíndromo.");
    } else {
        System.out.println("A string não é um palíndromo.");
    }

        sc.close();
}
}
