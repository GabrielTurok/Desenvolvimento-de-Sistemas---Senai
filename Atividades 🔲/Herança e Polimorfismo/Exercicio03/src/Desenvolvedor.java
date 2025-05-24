public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salarioB) {
        super(nome, salarioB);
    }

    @Override
    public double CalcularSalario() {
        return salarioB + (salarioB * 0.1);
    }
}
