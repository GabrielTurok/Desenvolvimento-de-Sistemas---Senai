package Media_e_Notas;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        float n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota:");
        float n2 = sc.nextFloat();

        float media = (n1 + n2) / 2;

        if (media < 5){
            System.out.println("Voce foi reprovado sua nota é: "+ media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Voce esta em recuperação sua nota é : "+ media);
        }else {
            System.out.println("Voce foi aprovadosua nota é : "+ media);
        }
    }
}
