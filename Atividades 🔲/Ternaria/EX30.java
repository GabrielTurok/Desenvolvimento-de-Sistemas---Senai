package Ternaria;

import java.util.Scanner;

public class EX30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a suas duas notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double m = (n1 + n2) / 2;

        System.out.println((m >= 6)? "Aprovado":"Reprovado");
    }
}
