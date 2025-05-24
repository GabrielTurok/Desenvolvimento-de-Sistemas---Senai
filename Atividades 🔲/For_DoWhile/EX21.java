package FOR_e_DoWhile;

import java.util.Scanner;

public class EX21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        String n = sc.nextLine();

        int soma = 0;
        for (int i = 0; i < n.length(); i++){
            soma += Integer.parseInt(n.substring(i, i+1));
        }
        System.out.println(soma);
    }
}
