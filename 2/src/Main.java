
public class Main {
    public static void main(String[] args) {
        Rádio rádio1 = new Rádio();
        rádio1.setNome("Gaga");
        rádio1.setPreço(1985);
        rádio1.comportamento();

        Notebook notebook1 = new Notebook();
        notebook1.setNome("Dell inspiron 15");
        notebook1.setPreço(2140.15);
        notebook1.comportamento();

        Smartphone smartphone1 = new Smartphone();
        smartphone1.setNome("Iphone XS");
        smartphone1.setPreço(950.50);
        smartphone1.comportamento();

    }
}