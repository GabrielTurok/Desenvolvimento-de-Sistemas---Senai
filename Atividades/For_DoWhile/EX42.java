package FOR_e_DoWhile;

import java.util.Scanner;

public class EX42 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma string:");
    String e = sc.nextLine();

    int i = e.length() - 1;
    do {
        System.out.print(e.charAt(i));
        i--;
    } while (i >= 0);

    sc.close();
}
}