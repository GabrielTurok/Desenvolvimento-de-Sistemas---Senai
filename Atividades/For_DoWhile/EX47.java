package FOR_e_DoWhile;

import java.util.Scanner;

public class EX47 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scanner.nextInt();
        int i = 2;
        boolean p = true;

        do {
            if (n % i == 0) {
                p = false;
                break;
            }
            i++;
        } while (i <= n / 2);

        if (p && n > 1) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        scanner.close();
    }
}