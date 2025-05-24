package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;

        System.out.println("Digite um numero: ");
        a = sc.nextInt();


        try {

            if (a < 0){
                throw new IllegalArgumentException();
            }

             a = (int) Math.sqrt(a);


        } catch (IllegalArgumentException e) {
            System.out.println("Digite um numero positivo!");
        }finally {
            System.out.println(a);
        }

    }
}