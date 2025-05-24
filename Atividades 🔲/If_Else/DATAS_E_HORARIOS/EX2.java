package Datas_e_Horarios;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do mes: ");
        int mes = sc.nextInt();

        if (mes >= 01 && mes<= 12){
            System.out.println("Mes valido!");
        }else {
            System.out.println("Mes invalido!");
        }
    }
}
