package Datas_e_Horarios;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digte o horario de agora: ");
        int h = sc.nextInt();

        if (h >= 0 && h <= 24){
            System.out.println("Horario informado valido!");
        }else {
            System.out.println("Horario informado invalido!");
        }
    }
}
