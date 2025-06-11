package BASICOS;

import java.util.Scanner;

public class EX3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        sc.close();
        System.out.println(outro(n1, n2));

        maior(n1, n2);
    }


        public static String outro(int gb, int tt) {
            String result;
        if(gb > tt){
            result = "O primeiro numero é maior que o segundo!";
        } else if (tt > gb) {
            result = "O segundo numero é maior que o primeiro!";
        }else {
            result = "Os numeros sao iguais!";
        }
        return result;
    }





    public static void maior(int numero1, int numero2){
        String result;
        if(numero1 > numero2){
            result = "O primeiro numero é maior que o segundo!";
        } else if (numero1 < numero2) {
            result = "O segundo numero é maior que o primeiro!";
        }else {
            result = "Os numeros sao iguais!";
        }
        System.out.println(result);
    }
}
