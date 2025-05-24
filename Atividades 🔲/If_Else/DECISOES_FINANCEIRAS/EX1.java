package Decisões_Financeiras;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o saldo da sua conta?");
        float saldo = sc.nextFloat();

        if (saldo > 20) {
            System.out.println("Saldo suficiente para saque!");
        }else {
            System.out.println("Saldo insuficiente para saque!");
        }

    }
}
