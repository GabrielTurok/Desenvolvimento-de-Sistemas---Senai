package Media_e_Notas;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int n1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int n2 = sc.nextInt();
        System.out.println("Digite a terceira nota: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1+" é a maior nota!");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2+" é a maior nota!");
        } else {
            System.out.println(n3 + " é a maior nota!");
        }

        if (n1 < n2 && n1 < n3) {
            System.out.println(n1+" é a menor nota!");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2+" é a menor nota!");
        } else {
            System.out.println(n3 + " é a menor nota!");
        }
    }
}
