package BASICOS;

import java.io.Console;
import java.util.Scanner;

public class EX4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int n = sc.nextInt();

        guardaidade(n);

        RESPOSTA(guardaidade(n));
    }


    public static String guardaidade(int idade) {
        String texto;
        if (idade >= 16) {
            texto = "Voce pode votar!";
        } else {
            texto = "Voce nao pode votar!";
        }
        return texto;
    }


    public static void RESPOSTA(String texto) {
        System.out.println(texto);
    }
}
