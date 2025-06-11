package Decisões_Financeiras;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra? ");
        double compra = sc.nextFloat();
        double desconto;
        double valortotal;

        System.out.println("Valor: "+ compra);
        if (compra > 500){
            desconto = compra * 0.1;
            System.out.println("Desconto: "+ desconto);
            valortotal= compra - desconto;
            System.out.println("Valor com desconto: "+valortotal);
        }
    }
}
