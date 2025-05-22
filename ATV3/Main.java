package ATV3;

public class Main {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente c1 = new ContaCorrente("Dani", 1000);
        ContaCorrente c2 = new ContaCorrente("Lupim", 3000);
        c1.consultarSaldo();
        c2.consultarSaldo();


        c1.depositar(500);
        c1.sacar(200);
        c1.consultarSaldo();

        c1.sacar(1000);
        c1.consultarSaldo();

        c1.transferir(1500, c2);
        c1.consultarSaldo();
        c2.consultarSaldo();

        c2.sacar(2000);
    }
}

