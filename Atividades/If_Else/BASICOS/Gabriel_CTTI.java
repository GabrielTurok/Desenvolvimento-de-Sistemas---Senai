package BASICOS;

import java.util.Scanner;

public class Gabriel_CTTI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Digite um numero: ");
        n = sc.nextInt();

        if(n > 0){
            System.out.println("Numero é positivo!");
        } else if (n < 0) {
            System.out.println("Numero é negativo!");
        } else {
            System.out.println("Invalido!");
        }
    }
}
