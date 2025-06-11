package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] n = {10,20,30,40,50};

        System.out.println("Digite um indice de 0 a 4: ");
        int a = sc.nextInt();
        try {
            System.out.println(n[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice digitado não existe!");
        }finally {
            sc.close();
        }


    }
}