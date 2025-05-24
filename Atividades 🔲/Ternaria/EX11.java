package Ternaria;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caractere: ");
        char t = sc.nextLine().toLowerCase().charAt(0);

        System.out.println((t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u')? "Vogal" : "Consoante");
    }
}
