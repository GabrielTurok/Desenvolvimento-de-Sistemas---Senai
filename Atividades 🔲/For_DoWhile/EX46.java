package FOR_e_DoWhile;

import java.util.Scanner;

public class EX46 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número:");
    int n = scanner.nextInt();
    int i = 1;

    System.out.println("Os primeiros 10 múltiplos de " + n + " são:");
    do {
        System.out.println(n * i);
        i++;
    } while (i <= 10);

    scanner.close();
}
}