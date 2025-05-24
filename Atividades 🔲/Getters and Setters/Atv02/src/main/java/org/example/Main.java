package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o nome do titular desta conta: ");
        String titular = sc.nextLine();
        conta.setTitular(titular);

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        conta.setSaldo(saldo);


        conta.Depositar(10);
        conta.Sacar(5);

        System.out.println(conta.ExibirSaldo());
    }
}