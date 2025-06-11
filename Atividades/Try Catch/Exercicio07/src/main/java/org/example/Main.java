package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Digte tres notas: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            System.out.println((a+b+c) / 3);

        } catch (InputMismatchException e) {
            System.out.println("Numero invalido!");
        } finally {
            sc.close();
        }
    }
}