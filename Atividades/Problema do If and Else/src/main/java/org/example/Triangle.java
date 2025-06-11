package org.example;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String Resultado (Triangle areaX,Triangle areaY){
        String r;
        if(areaX.area() > areaY.area()){
            r = "Larger area: X";
        }else {
            r = "Larger area: Y";
        }
        return r;
    }
/*
A outra opcao era de se inserir o tipo de variavel por exemplo
double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
return result;

Essa maneira tbm funciona mas o melhor 'e o de cima por evita quantidades enormes de codigos.
*/
}
