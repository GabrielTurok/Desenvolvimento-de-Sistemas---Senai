package Desafios_e_Jogos;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n1 = sc.nextInt();
        System.out.print("Informe outro número: ");
        int n2 = sc.nextInt();

        if (n1 > (n2 * 2)){
            System.out.println(n1 + " é maior que o dobro de " + n2);
        } else {
            System.out.println(n1 + " é não é maior que o dobro de " + n2);
        }
    }
}