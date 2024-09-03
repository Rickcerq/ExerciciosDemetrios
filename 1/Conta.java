public class Conta {
    protected Long CPF;
    protected String Nome;
    protected int Senha;
    protected double Saldo;

    public Conta(){}

    public Conta(Long CPF, String Nome, int Senha, double Saldo){
        this.CPF = CPF;
        this.Nome = Nome;
        this.Senha = Senha;
        this.Saldo = Saldo;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int senha) {
        Senha = senha;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "CPF=" + CPF +
                ", Nome='" + Nome + '\'' +
                ", Senha=" + Senha +
                ", Saldo=" + Saldo +
                '}';
    }

    public void Pagamento(){

    }
}
