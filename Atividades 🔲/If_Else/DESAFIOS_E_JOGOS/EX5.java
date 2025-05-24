package Desafios_e_Jogos;

import java.util.Random;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        int t;
        int r = num.nextInt(10) + 1;

        do {

            System.out.print("Digite um número de 1 a 10: ");
            t = sc.nextInt();

        } while(t != r);

        System.out.println("Voce acertou o número");
        sc.close();
    }
}

