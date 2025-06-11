package Criação_de_Métodos_e_Classe_Java_2.Atv2;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = sc.nextInt();
        Obj2 numero = new Obj2();


        System.out.println(numero.Resultado(n));




    }
}
