package Ternaria;

import java.util.Scanner;

public class EX23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String s = sc.nextLine();

        System.out.println((s.length() >= 8)? "Senha valida":"Senha invalida");
    }
}
