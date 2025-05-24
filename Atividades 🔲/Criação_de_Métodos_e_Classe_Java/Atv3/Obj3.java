package Criação_de_Métodos_e_Classe_Java_2.Atv3;

public class Obj3 {


    public String Resultado(int n1, int n2) {
        String r;
        if (n1 > n2) {
            r = "O primeiro numero é maior que o segundo!";
        } else if (n2 > n1) {
            r = "O segundo numero é maior que o primeiro!";
        } else {
            r = "Os numeros sao iguais!";
        }
        return r;
    }
}
