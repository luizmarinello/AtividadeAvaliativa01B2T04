package principal;



public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: nome inválido!");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: salário não pode ser negativo!");
        }
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Salário aumentado em " + percentual + "% com sucesso!");
        } else {
            System.out.println("Erro: percentual inválido!");
        }
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("Luiz");
        f1.setSalario(2000);

        System.out.println("Funcionário: " + f1.getNome());
        System.out.println("Salário atual: R$" + f1.getSalario());

        f1.aumentarSalario(10);

        System.out.println("Novo salário: R$" + f1.getSalario());
    }
}
