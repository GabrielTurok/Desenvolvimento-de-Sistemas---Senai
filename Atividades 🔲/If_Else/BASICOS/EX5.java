package BASICOS;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero:");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " é o maior entre os tres!");

        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " é o maior entre os tres!");

        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " é o maior entre os tres!");

        }else {
            System.out.println("Invalido");
        }
    }
}
