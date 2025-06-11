package Situacoes_Cotidianas;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Escreva um temperatura em °C ");
            Double T = sc.nextDouble();
            sc.nextLine();

            System.out.println("Deseja converter para Kelvin?");
            String r = sc.nextLine();

            if(r.equalsIgnoreCase("sim")){

                System.out.println("em kelvin fica: " + (T + 273.15));

            } else {
                System.out.printf("Ok tchau!");
            }
            sc.close();
        }
}