package ATIVIADES_RECESSO.ATV02;

public class Obj2 {
    public double salarioB;
    public double imposto;
    public double NetSalary;
    public double Tax;

    public double GrossSalary(double salarioB, double imposto){
        double r = (salarioB - imposto);
        return r;
    }

    public double IncreeseSalary(double salarioB, double NetSalary, double imposto, double Tax){
        double c = ((salarioB / 100) * NetSalary);
        double r = (c + GrossSalary(salarioB, Tax));
        return r;
    }
}
