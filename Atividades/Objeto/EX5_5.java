package BASICOS;

import java.util.Scanner;

public class EX5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero:");
        int n3 = sc.nextInt();


        System.out.println(armazemnumero(n1,n2,n3));

        resultadofinal(armazemnumero(n1,n2,n3));
    }

    public static String armazemnumero(int n1, int n2, int n3) {
        String t;
        if (n1 > n2 && n1 > n3) {
            t = n1 + " é o maior entre os tres!";

        } else if (n2 > n1 && n2 > n3) {
            t = n2 + " é o maior entre os tres!";

        } else if (n3 > n1 && n3 > n2) {
            t = " é o maior entre os tres!";

        } else {
            t = "Invalido";
        }
        return  t;
    }

    public static void resultadofinal(String resultadofinal1) {
        System.out.println(resultadofinal1);
    }
}
