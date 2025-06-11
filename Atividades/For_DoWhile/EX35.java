package FOR_e_DoWhile;

import java.util.Scanner;

public class EX35 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    System.out.println("Escreva um número");
    int n = sc.nextInt();

    do{
        System.out.println(n + " x " + i + " = " + n * i);
        i++;
    }while(i <=10);
    sc.close();
}
}