package Criação_de_Métodos_e_Classe_Java_2.Atv3;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro numero:");
        int n1 = sc.nextInt();


        System.out.println("Digite o segundo numero:");
        int n2 = sc.nextInt();
        Obj3 resfinal = new Obj3();
        System.out.println(resfinal.Resultado(n1, n2));
    }
}
