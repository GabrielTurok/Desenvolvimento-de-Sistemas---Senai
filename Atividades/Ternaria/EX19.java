package Ternaria;

import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero divisivelr por 2 ou 3: ");
        int n = sc.nextInt();

        System.out.println((n % 2 == 0 || n % 3 == 0)? "Divisivel":"Não divisivel");
    }
}
