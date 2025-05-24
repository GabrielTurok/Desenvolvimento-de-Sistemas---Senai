package Exercícios_para_Math.sqrt;

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = 0.001;
        double n1 = Math.sqrt(n);

        System.out.printf("%.3f", n1);
    }
}
