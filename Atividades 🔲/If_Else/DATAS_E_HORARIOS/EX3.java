package Datas_e_Horarios;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita um dia do mes de fevereiro: ");
        int d = sc.nextInt();

        if (d >= 1 && d <=28){
            System.out.println("Dia do mes valido!");
        }else {
            System.out.println("Dia do mes invalido!");
        }
    }
}
