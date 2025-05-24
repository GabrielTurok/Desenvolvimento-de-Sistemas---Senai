package Categorias_e_Classificações;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  sua idade: ");
        int idade = sc.nextInt();

        if (idade < 12){
            System.out.println("Criança!");
        } else if (idade>= 12 && idade < 18) {
            System.out.println("Adolescente!");
        } else {
            System.out.println("Adulto!");
        }
    }
}
