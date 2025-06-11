package BASICOS;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma vogal:");
        char letra = sc.nextLine().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra +" é um vogal!");
        }else {
            System.out.println(letra + " não é uma vogal!");
        }
    }
}
