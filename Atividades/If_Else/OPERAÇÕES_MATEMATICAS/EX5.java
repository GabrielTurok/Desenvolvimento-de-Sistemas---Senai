package Operações_Matemáticas;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (n * n == (n^2)){
            System.out.println(n+" é um quadrado perfeito!");
        }else {
            System.out.println(n+"  não é um quadrado perfeito!");
        }
    }
}
