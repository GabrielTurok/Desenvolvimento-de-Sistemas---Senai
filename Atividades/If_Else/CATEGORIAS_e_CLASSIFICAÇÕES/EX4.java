package Categorias_e_Classificações;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nivel da sua pressao arterial: ");
        int p = sc.nextInt();

        if (p <= 120){
            System.out.println("Normal!");
        } else if (p >= 121 && p <= 139) {
            System.out.println("Moderado!");
        }else {
            System.out.println("Alto!");
        }
    }
}
