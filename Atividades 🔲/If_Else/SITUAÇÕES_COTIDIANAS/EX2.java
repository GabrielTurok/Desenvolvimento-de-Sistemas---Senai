package Situacoes_Cotidianas;

import java.util.Scanner;

    public class EX2 {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite sua senha de acesso: ");
            int  s = sc.nextInt();

            int sr = 1234;

            if (s == sr){
                System.out.println("Senha correta!");
            } else{
                System.out.println("Senha incorreta!");
            }
            sc.close();
        }
    }
