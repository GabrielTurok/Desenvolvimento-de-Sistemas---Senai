public class PagamentoDinheiro extends Pagamento{
    public PagamentoDinheiro() {
    }

    @Override
    void realizaPagamento() {
        System.out.println("Pagamento em dinheiro recebido");
    }
}