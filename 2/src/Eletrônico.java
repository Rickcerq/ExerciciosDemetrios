public class Eletrônico {
    protected String Nome;
    protected double Preço;

    public Eletrônico(String nome, double preço) {
        Nome = nome;
        Preço = preço;
    }

    public Eletrônico(){}

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
