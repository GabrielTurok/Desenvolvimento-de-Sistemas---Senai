package FOR_e_DoWhile;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        for(int i = 0; i < 11; i++){
            System.out.println(i+" x "+ n +" = "+ i * n);
        }
    }
}
