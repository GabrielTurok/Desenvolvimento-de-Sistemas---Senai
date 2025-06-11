package Ternaria;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println((n > 0)?"positivo":(n < 0)?"negativo": "zerobn");
    }
}
