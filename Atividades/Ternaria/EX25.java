package Ternaria;

import java.util.Scanner;

public class EX25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia da semana(1 para segunda-feira, 7 para domingo): ");
        int d = sc.nextInt();

        System.out.println((d >= 1 && d <= 5)? "Dia util" : "Final de semana");
    }
}
