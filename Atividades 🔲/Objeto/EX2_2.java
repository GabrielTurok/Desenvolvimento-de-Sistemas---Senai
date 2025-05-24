package BASICOS;

import java.util.Scanner;

public class EX2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        parouimpar(n);

        sc.close();
    }

    public static int parouimpar(int v) {


        if(v % 2 == 0){
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
        }
        return v;
    }
}
