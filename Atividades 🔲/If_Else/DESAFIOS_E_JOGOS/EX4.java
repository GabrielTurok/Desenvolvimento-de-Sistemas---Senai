package Desafios_e_Jogos;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o 1 número: ");
        int n1 = sc.nextInt();
        System.out.print("Informe o 2 número: ");
        int n2 = sc.nextInt();
        System.out.print("Informe o 3 número: ");
        int n3 = sc.nextInt();

        if (n1 < n2 && n2 < n3){
            System.out.println(n1 + ", "+ n2 + ", "+ n3);
        } else if (n1 < n2 && n2 > n3){
            System.out.println(n1 + ", "+ n3 + ", "+ n2);
        } else if (n1 >n2 && n1 < n3) {
            System.out.println(n2 + ", "+ n1 + ", "+ n3);
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n2 + ", "+ n3 + ", "+ n1);
        } else if (n3 < n1 && n1 > n2) {
            System.out.println(n3 + ", "+ n2 + ", "+ n1);
        } else {
            System.out.println(n3 + ", "+ n1 + ", "+ n2);
        }
    }
}

