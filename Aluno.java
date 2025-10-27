package principal;

public class Aluno {
    
    // o privado aq sao os dados do aluno
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    // aq é o nosso builder
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // soma 
    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    // aluno foi aprovado ( 60)
    public boolean aprovado() {
        return notaFinal() >= 60;
    }

    // faltaram para aprovação
    public double pontosFaltando() {
        if (aprovado()) {
            return 0.0;  // se aprovado N faltam pontos
        } else {
            return 60 - notaFinal(); // se reprovado, calcula a diferença
        }
    }

    // principal 
    public static void main(String[] args) {
        
        
        Aluno aluno1 = new Aluno("Luiz", 25.0, 20.0, 10.0); 
        System.out.println("Nota final = " + aluno1.notaFinal());

        
        if (aluno1.aprovado()) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
            System.out.println("Faltaram " + aluno1.pontosFaltando() + " pontos.");
        }
    }
}
