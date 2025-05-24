package BASICOS;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero:");
        n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Numero é par!");
        } else {
            System.out.println("Numero é impar!");
        }
    }
}
