package BASICOS;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println("O primeiro numero é maior que o segundo!");
        } else if (n2 > n1) {
            System.out.println("O segundo numero é maior que o primeiro!");
        }else {
            System.out.println("Os numeros sao iguais!");
        }
    }
}
