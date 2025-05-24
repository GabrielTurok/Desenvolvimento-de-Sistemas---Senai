package ATIVIADES_RECESSO.ATV02;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double Tax = sc.nextDouble();


        Obj2 obj = new Obj2();

        System.out.println("Employee: "+ name + " , $ "+ (obj.GrossSalary(GrossSalary,Tax)));

        System.out.print("Which percentege to increase salary? ");
        double NetSalary = sc.nextDouble();

        System.out.print("Updated data: "+ name+ ", $ " + obj.IncreeseSalary(GrossSalary ,NetSalary ,Tax , Tax));
            }
}