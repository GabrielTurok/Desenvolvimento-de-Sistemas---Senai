package Media_e_Notas;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int n1 = sc.nextInt();
        System.out.println("Digite a segunda nota:");
        int n2 = sc.nextInt();

        int nota = (n1 + n2) / 2;

        if (nota >= 7) {
            System.out.println("Voce foi aprovado!");
        }else {
            System.out.println("Voce foi reprovado");
        }
    }
}
