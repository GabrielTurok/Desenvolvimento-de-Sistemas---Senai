package Desafios_e_Jogos;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();

        if (n1 > 0 && n2 > 0){
            System.out.println("Ambos os números são positivos");
        } else if (n1 < 0 &&  n2 < 0) {
            System.out.println("Ambos os números são negativos");
        } else {
            System.out.println("Os números possuem sinais diferentes");
        }
    }
}
