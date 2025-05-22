package ATV3;

abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(titular +" Saldo depositado: " + valor);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println(titular +" Saldo sacado: " + valor);
    }

    public void transferir(double valor, Conta destino) {
        this.saldo -= valor;
        System.out.println(titular +" Saldo transferido: " + valor);
    }

    public void consultarSaldo() {
        System.out.println(titular +" Saldo atual: " + this.saldo);
    }
}
