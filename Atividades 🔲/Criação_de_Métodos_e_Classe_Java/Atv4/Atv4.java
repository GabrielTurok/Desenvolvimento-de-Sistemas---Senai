package Criação_de_Métodos_e_Classe_Java_2.Atv4;

import java.util.Scanner;

public class Atv4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a sua idade: ");
        int n = sc.nextInt();


        Obj4 resffinal = new Obj4();


        System.out.println(resffinal.resultado(n));


    }
}
