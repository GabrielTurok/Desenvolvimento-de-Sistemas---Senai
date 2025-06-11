package Categorias_e_Classificações;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 10) {
            System.out.println("Pertence à faixa de classificação A (1 a 10)!");
        } else if (n >= 11 && n <= 20) {
            System.out.println("Pertence à faixa de classificação B (11 a 20)!");
        }else {
            System.out.println("Pertence à faixa de classificação C (21 a 30)!");
        }
    }
}
