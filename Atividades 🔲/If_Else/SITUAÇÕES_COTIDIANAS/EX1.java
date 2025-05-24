package Situacoes_Cotidianas;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa de um veículo");
        String p = sc.nextLine();

        char guarda = p.charAt(p.length() - 1);

        int pf = guarda;

        if(pf % 2 == 0){
            System.out.println("Termina em par");
        } else {
            System.out.println("Termina em ímpar");
        }

        sc.close();
    }
}