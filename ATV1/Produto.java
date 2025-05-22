package ATV1;

public class Produto {
    public String nome;
    public double valor;
    public String descricao;

    public Produto(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
