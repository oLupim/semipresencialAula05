package ATV1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos = new ArrayList<>();
    private double valorTotal;

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.valor;
    }

    public double getTotal() {
        return valorTotal;
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println("\n" + p.nome + ":\n" + p.descricao);
            System.out.println(" - R$ " + p.valor);
        }
    }
}
