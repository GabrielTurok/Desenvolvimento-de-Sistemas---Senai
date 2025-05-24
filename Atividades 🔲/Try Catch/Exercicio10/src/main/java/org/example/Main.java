package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new NumeroNegativoException("Número não pode ser negativo!");
            }

            if (num > 10){
                throw new LimiteFatorialExcedidoException("Numero muito grande!");
            }

            System.out.println("Fatorial de " + num + " é: " + calcularFatorial(num));

        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e ){
            System.out.println("Invalido!");
        } finally {
            sc.close();
        }

        public static long calcularFatorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * calcularFatorial(n - 1);
        }
}
