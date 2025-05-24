package Categorias_e_Classificações;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em grau celsius: ");
        float t = sc.nextFloat();

        if (t < 10){
            System.out.println("Frio!");
        } else if (t >= 10 && t <= 29) {
            System.out.println("Moderado!");
        }else {
            System.out.println("Quente!");
        }
    }
}
