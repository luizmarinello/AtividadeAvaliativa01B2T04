package principal;

public class ProdutoEstoque {

      private String nome;
    private int quantidade;

    //validação
    public ProdutoEstoque(String nome, int quantidade) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio!");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade inicial não pode ser negativa!");
        }
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // adicionar 
    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
        } else {
            System.out.println("A quantidade a adicionar deve ser positiva!");
        }
    }

   
    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Quantidade inválida para remoção!");
        }
    }


    public int getQuantidade() {
        return quantidade;
    }

    // principal
    public static void main(String[] args) {

       
        ProdutoEstoque produto = new ProdutoEstoque("Mouse Gamer", 10);

        // Adicionando e removendo 
        produto.adicionarEstoque(5);   // agora total = 15
        produto.removerEstoque(3);     // agora total = 12

        // final
        System.out.println("Produto: " + produto.nome);
        System.out.println("Quantidade final em estoque: " + produto.getQuantidade());
    }
}
