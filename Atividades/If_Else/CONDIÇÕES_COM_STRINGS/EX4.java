package Condições_com_Strings;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        palavra.replace("", "");

        if (palavra.length() > 5 ){
            System.out.println("Essa palavra tem mais de 5 caracteres!");
        }else {
            System.out.println("Essa palavra tem menos de 5 caracteres!");
        }
    }
}
