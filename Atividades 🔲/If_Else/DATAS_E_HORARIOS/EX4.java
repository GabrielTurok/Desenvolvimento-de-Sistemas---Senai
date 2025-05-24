package Datas_e_Horarios;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        int h = sc.nextInt();

        if (h < 12){
            System.out.println("Manhã");
        } else if (h < 18){
            System.out.println("Tarde");
        } else if (h < 24){
            System.out.println("Noite");
        } else {
            System.out.println("Horário Inválido");
        }
    }
}
