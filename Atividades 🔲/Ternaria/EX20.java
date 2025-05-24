package Ternaria;

import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        double n = sc.nextDouble();

        System.out.println((n >= 5 && n <= 6.9)? "Recuperação":(n > 7)? "Aprovado" : "Reprovado");
    }
}
