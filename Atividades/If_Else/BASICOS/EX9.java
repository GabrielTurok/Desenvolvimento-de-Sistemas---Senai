package BASICOS;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero entre 10 e 50: ");
        int n = sc.nextInt();

        if (n >= 10 && n <= 50) {
            System.out.println(n + " esta entre 10 e 50!");
        }else {
            System.out.println(n + " não esta entre 10 e 50!");
        }
    }
}
