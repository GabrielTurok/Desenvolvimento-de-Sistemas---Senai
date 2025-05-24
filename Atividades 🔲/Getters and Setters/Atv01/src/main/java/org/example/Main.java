package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        pessoa.setNome(nome);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        pessoa.setIdade(idade);



        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());

        sc.close();
    }
}