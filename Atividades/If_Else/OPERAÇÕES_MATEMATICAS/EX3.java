package Operações_Matemáticas;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        if (n1 % n2 == 0) {
            System.out.println(n1+" é divisivel por "+ n2);
        }else {
            System.out.println(n1+" não é divisivel por "+ n2);
        }
    }
}
