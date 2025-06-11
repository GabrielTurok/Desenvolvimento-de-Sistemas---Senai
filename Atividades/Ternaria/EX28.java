package Ternaria;

import java.util.Scanner;

public class EX28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println((n >=20 && n <= 30)? "Esta dentro do intervalo de 20 a 30!" : "Esta fora do intervalo de 20 a 30!");
    }
}
