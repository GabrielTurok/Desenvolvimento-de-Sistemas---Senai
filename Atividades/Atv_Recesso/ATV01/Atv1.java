package ATIVIADES_RECESSO.ATV01;

import java.util.Scanner;


public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double width, height;


        System.out.println("Enter rectangle width and height: ");
        width = sc.nextDouble();
        height = sc.nextDouble();


        Obj1 obj = new Obj1();


        obj.Area(width, height);
        obj.Perimetro(width, height);
        obj.Diagonal(width, height);


        System.out.println("AREA = " + obj.Area(width, height));
        System.out.println("PERIMETER = " + obj.Perimetro(width, height));
        System.out.println("DIAGONAL = "+obj.Diagonal(width, height));
    }
}
