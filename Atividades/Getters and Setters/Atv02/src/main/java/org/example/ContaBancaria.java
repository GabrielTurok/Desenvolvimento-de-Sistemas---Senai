package org.example;

public class ContaBancaria {
    private String Titular;
    private double Saldo;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public void Depositar(double v){
        if(v > 0){
            Saldo += v;
        }else{
            throw new RuntimeException("Não é possivel inserir um valor negativo!");
        }
    }

    public void Sacar(double v){
        if (v <= Saldo){
            Saldo -= v;
        }else{
            throw new RuntimeException("Não é possivel sacar um valor acima do seu Saldo atual!");
        }
    }

    public double ExibirSaldo(){

        return Saldo;
    }
}
