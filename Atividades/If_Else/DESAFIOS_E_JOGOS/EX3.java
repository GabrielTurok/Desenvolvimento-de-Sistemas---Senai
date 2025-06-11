package Desafios_e_Jogos;

import java.util.Scanner;

public class EX3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ns = 16976;
            int t;


            do {
                System.out.print("Adivinhe um número : ");
                t = sc.nextInt();
                if (t != ns){
                    System.out.println("Tente Novamente");
                }
            }while(t != ns);

            System.out.println("Você adivinhou o número secreto!");
        }
    }