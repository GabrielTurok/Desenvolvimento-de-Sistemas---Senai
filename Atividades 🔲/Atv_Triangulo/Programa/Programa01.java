package AttTringulo.Programa;

import AttTringulo.Objetos.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Programa01 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Triangulo x = new Triangulo();
            Triangulo y = new Triangulo();

            System.out.println("Enter the measures of triangle X: ");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();
            System.out.println("Enter the measures of triangle x: ");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();

            double areaX = x.area();

            double areaY = y.area();

            System.out.println("Triangle X area: " + areaX);
            System.out.println("Triangle X area: " + areaY);

            System.out.println(x.total(x, y));


            sc.close();
        }
    }