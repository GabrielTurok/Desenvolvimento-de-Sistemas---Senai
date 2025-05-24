package FOR_e_DoWhile;

import java.util.Scanner;

public class EX54 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n;

    do {
        System.out.println("Digite um número (digite um número negativo para sair):");
        n = sc.nextDouble();

        if (n >= 0) {
            System.out.println("A raiz quadrada de " + n + " é: " + Math.sqrt(n));
        }

    } while (n >= 0);

    sc.close();
}
}