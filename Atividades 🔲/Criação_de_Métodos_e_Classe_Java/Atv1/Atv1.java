package Criação_de_Métodos_e_Classe_Java_2.Atv1;

import java.util.Scanner;

public class Atv1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        Obj1 numero = new Obj1();


        System.out.println(numero.verificadorPositivoOuNegativo(n));
    }
}
