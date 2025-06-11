package Criação_de_Métodos_e_Classe_Java_2.Atv1;

public class Obj1 {
    public int n;

    public String verificadorPositivoOuNegativo(int n) {
        String resultado;
        if(n > 0){
            resultado = "Numero é positivo!";
        } else if (n < 0) {
            resultado = "Numero é negativo!";
        } else {
            resultado = "Invalido!";
        }
        return resultado;
    }
}
