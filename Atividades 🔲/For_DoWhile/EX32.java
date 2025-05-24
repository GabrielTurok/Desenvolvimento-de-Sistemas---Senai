package FOR_e_DoWhile;

import java.util.Scanner;

public class EX32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s =0;
        System.out.println("Digite números (0 para sair)");
        do {
            int n = sc.nextInt();
            if (n !=0) {
                s += n;
            } else break;
        }while (true);
        System.out.println(s);
        sc.close();
    }
}
