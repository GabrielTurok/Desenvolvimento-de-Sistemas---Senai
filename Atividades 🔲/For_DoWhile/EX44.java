package FOR_e_DoWhile;

import java.util.Scanner;

public class EX44 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número:");
    int n = sc.nextInt();
    int i = 1;

    System.out.println("Os divisores de " + n + " são:");
    do {
        if (n % i == 0) {
            System.out.println(i);
        }
        i++;
    } while (i <= n);

    sc.close();
}
}