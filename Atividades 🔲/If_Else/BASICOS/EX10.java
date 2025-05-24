package BASICOS;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (n >= 100 && n <= 200){
            System.out.println(n + " esta entre 100 e 200!");
        }else {
            System.out.println(n + " não esta entre 100 e 200!");
        }
    }
}
