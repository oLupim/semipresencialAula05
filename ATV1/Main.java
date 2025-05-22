package ATV1;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Camisa", 50.0, "Camisa de algodão");
        Produto p2 = new Produto("Calça", 100.0, "Calça jeans");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarAoCarrinho(p1);
        carrinho.adicionarAoCarrinho(p2);

        carrinho.listarProdutos();
        System.out.println("\n(Valor total: R$ " + carrinho.getTotal() + (")"));
    }
}
