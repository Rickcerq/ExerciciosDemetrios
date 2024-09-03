import java.util.Objects;

public class ContaCartão extends Conta {
    private Long NumeroCartão;

    public ContaCartão(Long CPF, String Nome, int Senha, double Saldo, Long numeroCartão) {
        super(CPF, Nome, Senha, Saldo);
        NumeroCartão = numeroCartão;
    }

    public Long getNumeroCartão() {
        return NumeroCartão;
    }

    public void setNumeroCartão(Long numeroCartão) {
        NumeroCartão = numeroCartão;
    }

    @Override
    public void Pagamento() {
    }

    public void Pagamento(Long Number, Double Valor){
        if (Objects.equals(Number, NumeroCartão)){
            setSaldo(Saldo - Valor);
        }
        else {
            System.out.println("Numero do cartão errado, insira novamente");
        }

    }
}
