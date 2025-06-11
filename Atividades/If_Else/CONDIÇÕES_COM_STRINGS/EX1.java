package Condições_com_Strings;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sim ou não!");
        String letra = sc.nextLine();

        if (letra.equalsIgnoreCase("sim")) {
            System.out.println("Voce digitou sim!");
        } else if (letra.equalsIgnoreCase("não")){
            System.out.println("Voce digitou Não!");
        }else {
            System.out.println("Invalido!");
        }
    }
}
