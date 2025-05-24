package BASICOS;

import java.util.Scanner;

public class EX1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        verificarPositivoNegativo(numero);


        sc.close();

    }


    public static void verificarPositivoNegativo(int v) {
        String ehPositivo = "";
        String result = "";
        String ehNegativo;
        if (v > 0) {
            ehPositivo = "Numero é positivo!";
            result = ehPositivo;
        } else if (v < 0) {
            ehNegativo = "Numero é negativo!";
            result = ehNegativo;
        } else {
            System.out.println("Invalido!");
        }
        System.out.println(result);
    }
}