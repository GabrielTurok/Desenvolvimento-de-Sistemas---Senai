package Ternaria;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano bissexto: ");
        int ano = sc.nextInt();
        String resultado = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? "Bissexto" : "Não é bissexto";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}