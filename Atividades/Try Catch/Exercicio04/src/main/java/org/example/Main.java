package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int soma = 0;
        try {
            System.out.println("Digite dois numeros: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            soma = a+b;
            } catch (InputMismatchException e) {
            System.out.println("Digite um numero correto");
        }finally {
            sc.close();
        }
        System.out.println(soma);


    }
}