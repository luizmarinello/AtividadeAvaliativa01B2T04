package principal;

public class Filme {
    private String titulo;
    private double avaliacao;

    public Filme() {
    }

    public Filme(String titulo, double avaliacao) {
        setTitulo(titulo);
        setAvaliacao(avaliacao);
    }
// so pra puxar o titulo aq
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Erro: título inválido!");
        }
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao >= 0 && avaliacao <= 5) {
            this.avaliacao = avaliacao;
        } else {
            System.out.println("Erro: avaliação deve ser entre 0 e 5!");
        }
    }
//resposta
    public void exibir() {
        System.out.println("Filme: " + titulo + " | Avaliação: " + avaliacao + " ⭐");
    }

    // Método princ]
    public static void main(String[] args) {
        Filme f1 = new Filme("Vingadores", 4.8);
        Filme f2 = new Filme("Batman", 4.3);

        f1.exibir();
        f2.exibir();

        Filme f3 = new Filme("", 6); // sera que tem erro 
        f3.setTitulo("Interestelar");
        f3.setAvaliacao(5);
        f3.exibir();
    }
}

