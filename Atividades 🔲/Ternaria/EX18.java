package Ternaria;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado: ");
        int l1 = sc.nextInt();
        System.out.print("Digite o comprimento do segundo lado: ");
        int l2 = sc.nextInt();
        System.out.print("Digite o comprimento do terceiro lado: ");
        int l3 = sc.nextInt();

        String resultado = (l1 == l2 && l2 == l3) ? "Equilátero" :
                (l1 == l2 || l2 == l3 || l1 == l3) ? "Isósceles" : "Escaleno";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}