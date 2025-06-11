package Media_e_Notas;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Matemática");
        System.out.print("Informe sua nota do 1º Semestre: ");
        float nota1M = sc.nextFloat();
        System.out.print("Informe sua nota do 2º Semestre: ");
        float nota2M = sc.nextFloat();


        float mediaM = (nota1M + nota2M) / 2;


        System.out.println("Português");
        System.out.print("Informe sua nota do 1º Semestre: ");
        float nota1P = sc.nextFloat();
        System.out.print("Informe sua nota do 2º Semestre: ");
        float nota2P = sc.nextFloat();


        float mediaP = (nota1P + nota2P) / 2;


        if (mediaM >= 7 && mediaP >= 7) {
            System.out.println("O aluno foi aprovado em duas matérias diferentes");
        } else if (mediaM >= 7  && mediaP < 7) {
            System.out.println("O aluno foi aprovado apenas em matemática");
        } else if (mediaM < 7 && mediaP >= 7) {
            System.out.println("O aluno foi aprovado apenas em português");
        } else {
            System.out.println("O aluno foi reprovado nas duas matérias");
        }
        sc.close();
    }
}