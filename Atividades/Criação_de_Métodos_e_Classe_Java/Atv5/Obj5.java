package Criação_de_Métodos_e_Classe_Java_2.Atv5;

public class Obj5{
    public String resultado(int n1, int n2, int n3) {
        String r;
        if (n1 > n2 && n1 > n3) {
            r = n1 + " é o maior entre os tres!";


        } else if (n2 > n1 && n2 > n3) {
            r = n2 + " é o maior entre os tres!";


        } else if (n3 > n1 && n3 > n2) {
            r = n3 + " é o maior entre os tres!";


        }else {
            r = "Invalido";
        }
        return r;
    }
}
