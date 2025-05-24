package Criação_de_Métodos_e_Classe_Java_2.Atv5;

import java.util.Scanner;

public class Atv5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro numero:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero:");
        int n3 = sc.nextInt();


        Obj5 resfinal = new Obj5();
        System.out.println(resfinal.resultado(n1, n2, n3));
    }
}
