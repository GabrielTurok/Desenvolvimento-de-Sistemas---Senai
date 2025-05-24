public class Funcionario {
    protected String nome;
    protected double salarioB;

    public Funcionario(String nome, double salarioB) {
        this.nome = nome;
        this.salarioB = salarioB;
    }

    public double CalcularSalario(){
        return this.salarioB;
    }
}
