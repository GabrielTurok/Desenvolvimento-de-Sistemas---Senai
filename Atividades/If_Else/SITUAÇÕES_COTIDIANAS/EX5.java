package Situacoes_Cotidianas;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o usuário");
        String u = sc.nextLine();

        System.out.println("Senha: ");
        String s = sc.nextLine();

        if(s.equalsIgnoreCase("897")){
            System.out.println(u + " aprovado");
        } else {
            System.out.println(u + " não aprovado");
        }
        sc.close();
    }
}