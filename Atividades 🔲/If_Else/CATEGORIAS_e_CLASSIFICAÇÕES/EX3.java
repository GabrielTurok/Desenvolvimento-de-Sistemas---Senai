package Categorias_e_Classificações;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        float altura = sc.nextFloat();

        if (altura <= 1.68 ) {
            System.out.println("Voce é baixo!");
        } else if (altura > 1.69 && altura < 1.80) {
            System.out.println("Voce é medio!");
        } else {
            System.out.println("Voce é alto!");
        }
    }
}
