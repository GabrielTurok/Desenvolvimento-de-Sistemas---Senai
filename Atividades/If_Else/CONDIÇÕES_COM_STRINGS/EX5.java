package Condições_com_Strings;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String letra1 = sc.nextLine().toUpperCase();
        System.out.println("Digite outra palavra: ");
        String letra2 = sc.nextLine().toUpperCase();

        if (letra1.equalsIgnoreCase(letra2)) {
            System.out.println("As palavras são iguais!");
        }else {
            System.out.println("As palavras não são iguais!");
        }
    }
}
