package Decisões_Financeiras;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu salario? ");
        double sal = sc.nextDouble();

        if (sal >= 3000.0){
            System.out.println("Voce pode financiar um imovel!");
        }else {
            System.out.println("Voce não pode financiar um imovel!");
        }
    }
}
