package Criação_de_Métodos_e_Classe_Java_2.Atv6;

import java.util.Scanner;

public class Atv6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero multiplo por 5: ");
        int n = sc.nextInt();


        Obj6 resfinal = new Obj6();
        System.out.println(resfinal.resultado(n));
    }
}

