
public class Main {
    public static void main(String[] args) {
   ContaPix conta1 = new ContaPix(222345756L, "Marcelo", 1234, 3000.46, "marcelo@gmail.com");
   Produto produto1 = new Produto("Iphone 10", 950.50);

   conta1.Pagamento("marcelo@gmail.com", produto1.getPreço());

   System.out.println(conta1.Saldo);

    }
}