package BASICOS;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero multiplo por 5: ");
        int n = sc.nextInt();

        if(n % 5 == 0){
            System.out.println(n+" é multiplo por 5!");
        }else {
            System.out.println(n+ " não é multiplo por 5!");
        }
    }
}
