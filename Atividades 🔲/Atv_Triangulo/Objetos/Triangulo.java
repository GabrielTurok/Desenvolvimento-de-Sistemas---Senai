package AttTringulo.Objetos;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public String total(Triangulo triangulo1, Triangulo triangulo2) {
        String result;
        if (triangulo1.area() > triangulo2.area()) {
            result = "Larger area: X";
        } else {
            result = "Larger area: Y";
        }
        return result;

    }
}
