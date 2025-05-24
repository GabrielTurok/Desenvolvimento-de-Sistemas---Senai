package Operações_Matemáticas;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        int diferença = n1 - n2;

        if (diferença < 0){
            System.out.println("A diferença entre dois números é negativa!");
        }else {
            System.out.println("A diferença entre dois números não é negativa!");
        }
    }
}
