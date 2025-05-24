package Ternaria;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println((n % 5 == 0)? "Múltiplo de 5!" : "Não é múltiplo de 5");
    }
}
