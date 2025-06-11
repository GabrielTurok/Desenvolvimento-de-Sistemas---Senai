package Operações_Matemáticas;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o primeiro numero: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        if (soma > 100) {
            System.out.println("A soma é maior que 100!");
        }else {
            System.out.println("A soma é menor que 100!");
        }
    }
}
