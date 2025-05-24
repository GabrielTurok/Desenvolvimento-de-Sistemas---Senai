package Ternaria;

import java.util.Scanner;

public class EX24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int s = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }

        System.out.println((s == n) ? "Perfeito" : "Não perfeito");
    }
}
