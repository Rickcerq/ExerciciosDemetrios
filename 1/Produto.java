public class Produto {
    private String Nome;
    private double Preço;

    public Produto(String nome, double preço) {
        Nome = nome;
        Preço = preço;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPreço() {
        return Preço;
    }

    public void setPreço(double preço) {
        Preço = preço;
    }
}
