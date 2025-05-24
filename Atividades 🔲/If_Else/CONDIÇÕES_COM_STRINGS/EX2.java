package Condições_com_Strings;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1234;
        System.out.println("Digite uma senha: ");
        int s = sc.nextInt();
        if (n == s){
            System.out.println("SENHA CORRETA!");
        }else {
            System.out.println("SENHA INCORRETA!");
        }
    }
}
