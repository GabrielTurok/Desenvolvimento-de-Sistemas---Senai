package FOR_e_DoWhile;

import java.util.Scanner;

public class EX40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int n;

        do {
            System.out.println("Digite um número:");
            n = scanner.nextInt();
            i++;
        } while (n != 0);

        System.out.println("Você digitou " + (i - 1) + " números antes do zero.");
        scanner.close();
    }
}