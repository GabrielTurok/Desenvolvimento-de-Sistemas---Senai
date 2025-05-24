package Criação_de_Métodos_e_Classe_Java_2.Atv2;

public class Obj2 {


    public String Resultado(int n) {
        String resultado;
        if (n % 2 == 0) {
            resultado = "Numero é par!";
        } else {
            resultado = "Numero é impar!";
        }
        return resultado;
    }
}
