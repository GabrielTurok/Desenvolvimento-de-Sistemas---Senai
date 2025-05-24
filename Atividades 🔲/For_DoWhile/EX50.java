package FOR_e_DoWhile;

import java.util.Scanner;

public class EX50 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String correctPassword = "12345";
    String p;

    do {
        System.out.println("Digite a senha:");
        p = sc.nextLine();

        if (!p.equals(correctPassword)) {
            System.out.println("Senha incorreta, tente novamente.");
        }

    } while (!p.equals(correctPassword));

    System.out.println("Senha correta!");

    sc.close();
    }
}