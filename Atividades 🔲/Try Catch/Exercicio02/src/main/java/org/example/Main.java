package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a;
        int b= 0;
        System.out.println("Digite um numero: ");
        a = sc.nextLine();

        try {
        b = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido!");
        }


    }
}