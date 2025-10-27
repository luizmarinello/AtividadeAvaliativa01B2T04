package principal;

public class BicicletaAlugada {

    // 🔹 Atributos privados
    private int horas;
    private double valorHora;

    // 🔹 Construtor com validação
    public BicicletaAlugada(int horas, double valorHora) {
        if (horas < 1 || valorHora <= 0) {
            throw new IllegalArgumentException("As horas devem ser no mínimo 1 e o valor por hora deve ser maior que 0!");
        }
        this.horas = horas;
        this.valorHora = valorHora;
    }

    // 🔹 Método para calcular o valor total
    public double calcularValor() {
        return horas * valorHora;
    }

    // 🔹 Método principal para teste
    public static void main(String[] args) {

        // Criando o objeto
        BicicletaAlugada aluguel = new BicicletaAlugada(3, 15.0);

        // Mostrando o resultado
        System.out.println("Horas alugadas: " + aluguel.horas);
        System.out.println("Valor por hora: R$ " + aluguel.valorHora);
        System.out.println("Valor total a pagar: R$ " + String.format("%.2f", aluguel.calcularValor()));
    }
}
