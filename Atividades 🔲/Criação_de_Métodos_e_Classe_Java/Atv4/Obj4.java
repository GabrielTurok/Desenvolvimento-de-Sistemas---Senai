package Criação_de_Métodos_e_Classe_Java_2.Atv4;

public class Obj4{
    public String resultado(int n) {
        String r;
        if (n >= 16) {
            r = "Voce pode votar!";
        } else {
            r = "Voce nao pode votar!";
        }
        return r;
    }
}
