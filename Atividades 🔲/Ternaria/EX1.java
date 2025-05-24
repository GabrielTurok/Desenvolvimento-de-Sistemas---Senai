package Ternaria;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println("O número n é " + ((n % 2 == 0 ) ? "Par!" : "Impar!"));
    }
}
