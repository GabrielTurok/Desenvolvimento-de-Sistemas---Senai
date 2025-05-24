package Datas_e_Horarios;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int di = 01;
        int df = 10;
        System.out.println("Digite um dia do mes: ");
        int d = sc.nextInt();

        if (d >= di && d <= df) {
            System.out.println("Dia do mes dentro do periodo!");
        }else {
            System.out.println("Dia do mes fora do periodo!");
        }
    }
}
