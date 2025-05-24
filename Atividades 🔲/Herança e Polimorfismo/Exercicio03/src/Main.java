public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Gabriel", 1400.0);
        Gerente gerente = new Gerente("Sabrina", 600);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Armazano", 200);
        System.out.println(funcionario.CalcularSalario());
        System.out.println(gerente.CalcularSalario());
        System.out.println(desenvolvedor.CalcularSalario());
    }
}