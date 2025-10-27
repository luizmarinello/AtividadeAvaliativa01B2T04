package principal;


public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public String toString() {
        return nome + ", R$ " + preco + ", " + quantidade + " unidades, Total: R$ " + valorTotalEmEstoque();
    }

    public static void main(String[] args) {
        // insano
    }
}

