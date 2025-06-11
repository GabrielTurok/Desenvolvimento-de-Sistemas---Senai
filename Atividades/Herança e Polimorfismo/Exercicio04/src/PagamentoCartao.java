public class PagamentoCartao extends Pagamento{
    public PagamentoCartao() {
    }

    @Override
    void realizaPagamento() {
        System.out.println("Pagamento cartão aprovado!");
    }
}
