package Ternaria;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println((n1 > n2)? n1 : n2);
    }
}
