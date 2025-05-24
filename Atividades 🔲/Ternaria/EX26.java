package Ternaria;

import java.util.Scanner;

public class EX26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int i = sc.nextInt();

        System.out.println((i >= 16)? "Voce pode votar": "Voce nao pode votar");
    }
}
