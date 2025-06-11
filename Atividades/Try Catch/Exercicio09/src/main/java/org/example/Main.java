package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{

            double calc;
            System.out.println("Digite a temperatura em Celsius: ");

                if (!sc.hasNextDouble()) {
                    throw new InputMismatchException("Valor invalido!");
                }
                double temp = sc.nextDouble();

            calc = (temp * 9/5) + 32;

                if(calc < -273.15){
                    throw new TemperaturaInvalidaException("Temperatura Invalida");
                }else {
                    System.out.println(calc);
                }



        } catch (InputMismatchException e){
            System.out.println("Valor invalido!");

        }  catch (TemperaturaInvalidaException e) {
            System.out.println("Temperatura Invalida!");

        }finally {
            sc.close();
        }
    }
}