package org.example;

public class Produtos {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double PrecoProduto(double p){
        if (p > 0){
            preco = p;
        }else{
            throw new RuntimeException("Preço do produto inserido não pode ser negativo!");
        }
        return p;
    }

    public int AdicionarEstoque(int p){
        estoque += p;
        return p;
    }

    public int RemoverEstoque(int p){
        if(p <= estoque){
            estoque -= p;
        }else {
            throw new RuntimeException("Não pode ser retirado uma quantidade do estoque que não existe!");
        }
        return p;
    }

}
