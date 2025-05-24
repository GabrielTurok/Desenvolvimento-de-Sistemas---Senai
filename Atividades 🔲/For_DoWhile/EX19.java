package FOR_e_DoWhile;

import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();
        int fa = 1;

        for (int i = 2; i<= num; i++){
            fa *= i;
        }
        System.out.println("O fatorial de "+ num+" é: "+ fa);
        sc.close();
    }
}
