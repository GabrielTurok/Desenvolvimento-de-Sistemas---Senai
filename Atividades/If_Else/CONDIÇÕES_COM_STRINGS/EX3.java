package Condições_com_Strings;

import java.util.Locale;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o  seu nome:");
        String nome = sc.nextLine().toLowerCase();

        if (nome.charAt(0) == 'A') {
            System.out.println("Começa com a letra A!");
        }else {
            System.out.println("Não começa com A!");
        }
    }
}
