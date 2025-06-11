package Situacoes_Cotidianas;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva a idade da pessoa");
        int i = sc.nextInt();

        System.out.println("escreva o peso da pessoa");
        double p = sc.nextDouble();
        sc.nextLine();

        if (i > 18 && i < 65 && p >= 50){
            System.out.println("pode soar sangue");
        }else {
            System.out.println("não pode doar samgue");
        }
        sc.close();
    }
}
