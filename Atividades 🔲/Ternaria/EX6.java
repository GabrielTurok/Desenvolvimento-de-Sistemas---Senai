package Ternaria;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Voce tem carteira de motorista?(S/N)");
        String resp = sc.nextLine().toLowerCase();

        System.out.println((idade >= 18 && resp == "S")? "Voce pode dirigir!" : "Voce nao pode dirigir!");
    }
}
