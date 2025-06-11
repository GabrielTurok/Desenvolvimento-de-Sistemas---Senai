package FOR_e_DoWhile;

import java.util.Scanner;

public class EX45 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor máximo da sequência de Fibonacci:");
        int m = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Sequência de Fibonacci:");
        do {
            System.out.println(a);
            int n = a + b;
            a = b;
            b = n;
        } while (a <= m);

        sc.close();
    }
}