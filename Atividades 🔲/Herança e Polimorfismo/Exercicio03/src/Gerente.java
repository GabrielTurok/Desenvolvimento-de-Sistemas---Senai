public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioB) {
        super(nome, salarioB);
    }

    @Override
    public double CalcularSalario() {
        return salarioB += 500;
    }
}
