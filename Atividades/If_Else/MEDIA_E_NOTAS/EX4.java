package Media_e_Notas;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        float n = sc.nextFloat();
        
        if (n >= 7 && n<10){
            System.out.println("Aprovado!");
        } else if (n>=10) {
            System.out.println("Nota maxima!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
