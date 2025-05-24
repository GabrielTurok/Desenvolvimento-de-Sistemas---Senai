package ATIVIADES_RECESSO.ATV03;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota01, nota02, nota03;

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        do{
            System.out.println("Digite a primeira nota: ");
        nota01 = sc.nextDouble();
        }while(nota01 > 30);

        do{
            System.out.println("Digite a segunda nota: ");
        nota02 = sc.nextDouble();
        }while(nota02 > 35);

        do{
            System.out.println("Digite a terceira nota: ");
        nota03 = sc.nextDouble();
        }while(nota03 > 35);

        Obj3 obj = new Obj3(nota01, nota02, nota03);
        double nfinal = obj.cnfinal();

        System.out.println("FINAL GRADE = " + nfinal);
        System.out.println(obj.Aprovacao());
        if (nfinal < 60.0) {
            System.out.println(obj.quantospontosfaltam());
        }else {
            System.out.println(" ");
        }
        sc.close();
    }
}
