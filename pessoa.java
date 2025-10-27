package principal;

public class Pessoa {
    

    private String nome;
    private double peso;
    private double altura;


    public Pessoa(String nome, double peso, double altura) {

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio!");
        }
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero!");
        }

        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

   
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {
        double imc = calcularIMC();
        
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (mórbida)";
        }
    }

 
    public static void main(String[] args) {
        
        //  uma pessoa
        Pessoa p1 = new Pessoa("Luiz", 70.0, 1.75);

        // mostrando o IMC
        System.out.println("Nome: " + p1.nome);
        System.out.println("IMC: " + String.format("%.2f", p1.calcularIMC()));
        System.out.println("Classificação: " + p1.classificacaoIMC());
    }
}
