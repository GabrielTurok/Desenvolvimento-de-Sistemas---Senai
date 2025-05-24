package ATIVIADES_RECESSO.ATV01;

public class Obj1 {
    public double widht;
    public double height;


    public double Area(double width, double height){
        double r;
        r = width * height;
        return r;
    }


    public double Perimetro(double width, double height){
        double r;
        r = width + width + height + height;
        return r;
    }


    public double Diagonal(double width, double height) {
        double r;
        r = Math.sqrt((width * width) + (height * height));
        return r;
    }
}
