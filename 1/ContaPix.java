import java.util.Objects;

public class ContaPix extends Conta{
    private String chavePix;

    public ContaPix(Long CPF, String Nome, int Senha, double Saldo, String chavePix){
        super(CPF, Nome, Senha, Saldo);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }



    @Override
    public void Pagamento() {

    }

    public void Pagamento(String key, double valor) {
        if (Objects.equals(key, chavePix)) {
            setSaldo(Saldo - valor);
        }
        else {
            System.out.println("chave Pix errada, insira novamente");
        }
    }
}
