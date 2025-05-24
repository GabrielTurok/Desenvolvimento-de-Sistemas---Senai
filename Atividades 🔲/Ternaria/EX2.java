package Ternaria;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int i = sc.nextInt();

        System.out.println((i >= 18) ? "Maior de idade!" : "Menor de idade!");

    }
}
