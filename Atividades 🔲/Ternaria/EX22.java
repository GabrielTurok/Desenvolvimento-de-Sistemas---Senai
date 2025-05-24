package Ternaria;

import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double p = sc.nextDouble();

        System.out.println((p >= 100)? "Esse produto tem frete gratis!": "Esse produto não tem frete gratis!");
    }
}
