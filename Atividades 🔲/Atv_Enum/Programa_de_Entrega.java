package Atv_Enum;

import java.util.Scanner;

public class Programa_de_Entrega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Enum enum1 = Enum.Esperando_pagamento;
        Enum enum2 = Enum.Enviado;
        Enum enum3 = Enum.Em_Transito;
        Enum enum4 = Enum.Finalizado;
        System.out.println("Digite o codigo do pedido: ");
        int n = sc.nextInt();

        switch (n){
            case 10:
                System.out.println("Status do pedido: "+ enum1);
                break;
            case 20:
                System.out.println("Status do pedido: " + enum2);
                break;
            case 30:
                System.out.println("Status do pedido: "+ enum3);
                break;
            case 40:
                System.out.println("Status do pedido: "+ enum4);
                break;
            default:
                System.out.println("Codigo do pedido invalido!");
        }
    }
}
