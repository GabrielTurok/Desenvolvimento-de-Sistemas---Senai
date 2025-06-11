package FOR_e_DoWhile;

import java.util.Scanner;

public class EX39 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;

    do {
        System.out.println("Informe um número:");
        n = scanner.nextInt();
        if (n >= 0) {
            System.out.println("Número positivo: " + n);
        }
    } while (n >= 0);

    scanner.close();
}
}