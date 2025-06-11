package FOR_e_DoWhile;

import java.util.Scanner;

public class EX43 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número:");
    int n = scanner.nextInt();
    int s = 0;

    do {
        s += n % 10;
        n /= 10;
    } while (n > 0);

    System.out.println("A soma dos dígitos é: " + s);
    scanner.close();
}
}