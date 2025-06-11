package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int div = 0;
        System.out.println("Digite dois numeros inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();


        try {
            div = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Não pode realizar a divisao por 0");
        }finally {
            sc.close();
        }
        System.out.println(div);
    }
}