package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int i = sc.nextInt();

            if (i < 18){
                throw new IdadeInvalidaException(" ");
            }else {
                System.out.println(i);
            }
        } catch (IdadeInvalidaException e) {
            System.out.println("Idade Invalida");
        } finally {
            sc.close();
        }



    }
}