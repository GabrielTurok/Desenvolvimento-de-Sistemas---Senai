package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produtos = new Produtos();

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        produtos.setNome(nome);

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        produtos.setPreco(preco);

        System.out.println("Digite a quantidade do produto no estoque: ");
        int estoque = sc.nextInt();
        produtos.setEstoque(estoque);

        produtos.setPreco(5.00);
        produtos.setNome("Gabriel");
        produtos.setEstoque(100);

        System.out.println(produtos.getEstoque());
        System.out.println(produtos.getNome());
        System.out.println(produtos.getPreco());
    }
}