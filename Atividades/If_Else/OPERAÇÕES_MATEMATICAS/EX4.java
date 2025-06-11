package Operações_Matemáticas;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = sc.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("Triangulo equilatero.");
        } else if (n1 == n2 || n2 == n3) {
                System.out.println("Triangulo isosceles.");
            } else{
                System.out.println("Triangulo escaleno.");
            }
        }

    }
