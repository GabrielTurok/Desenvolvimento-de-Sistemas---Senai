package Ternaria;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println((n % 2 == 0 && n > 0)? "Par e positivo": (n % 2 == 0 && n < 0)? "Par e Negativo" : (n % 2 != 0 && n > 0)? "Ímpar e Positivo" : "Ímpar e Negativo");
    }
}
