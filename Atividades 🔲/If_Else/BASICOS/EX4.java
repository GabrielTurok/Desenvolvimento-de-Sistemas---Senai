package BASICOS;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int n = sc.nextInt();

        if (n >= 16 ) {
            System.out.println("Voce pode votar!");
        }else {
            System.out.println("Voce nao pode votar!");
        }
    }
}
