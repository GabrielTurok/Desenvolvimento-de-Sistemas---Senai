package FOR_e_DoWhile;

import java.util.Scanner;

public class EX48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite um número (digite 0 para sair):");
            n = sc.nextInt();

            if (n != 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " é par.");
                } else {
                    System.out.println(n + " é ímpar.");
                }
            }

        } while (n != 0);

        sc.close();
    }
}

