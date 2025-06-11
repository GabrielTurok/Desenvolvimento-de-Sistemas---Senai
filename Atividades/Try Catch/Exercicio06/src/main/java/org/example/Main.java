package org.example;

import javax.sound.midi.InvalidMidiDataException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();

            if (nome.isEmpty()){
                throw new DadosInvalidosException("Nome não pode ser vazio");
            }

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();



            if (idade < 0){
                throw new DadosInvalidosException("Idade não pode ser menor que zero!");
            }


        } catch (DadosInvalidosException e) {
            System.out.println("Dados invalidos!");
        } finally {
            sc.close();
        }


    }
}