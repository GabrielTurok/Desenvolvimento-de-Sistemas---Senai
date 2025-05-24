package Ternaria;

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos voce tem?");
        int i = sc.nextInt();

        System.out.println((i > 60 || (i >= 15 && i <= 18))? "Voce esta qualificado(a) para um desconte":"Voce não esta qualificado(a) para um desconte");
    }
}
