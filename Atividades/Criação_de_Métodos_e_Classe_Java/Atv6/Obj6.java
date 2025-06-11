package Criação_de_Métodos_e_Classe_Java_2.Atv6;

public class Obj6{
    public String resultado(int n) {
        String r;
        if(n % 5 == 0){
            r = n+" é multiplo por 5!";
        }else {
            r = n+ " não é multiplo por 5!";
        }
        return r;
    }
}
