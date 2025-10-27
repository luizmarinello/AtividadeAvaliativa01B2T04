package principal;

public class ContaLuz {

   
    private double consumoKwh;
    private double valorKwh;

    // 🔹 Construtor  e validação
    public ContaLuz(double consumoKwh, double valorKwh) {
        if (consumoKwh <= 0 || valorKwh <= 0) {
            throw new IllegalArgumentException("Consumo e valor do kWh devem ser maiores que zero!");
        }
        this.consumoKwh = consumoKwh;
        this.valorKwh = valorKwh;
    }

    // calcular 
    public double calcularValorTotal() {
        return consumoKwh * valorKwh;
    }

    //  principal 
    public static void main(String[] args) {

        // objeto da classe
        ContaLuz conta1 = new ContaLuz(250, 0.85);

        // dados e o total
        System.out.println("Consumo: " + conta1.consumoKwh + " kWh");
        System.out.println("Valor por kWh: R$ " + conta1.valorKwh);
        System.out.println("Valor total a pagar: R$ " + String.format("%.2f", conta1.calcularValorTotal()));
    }
}
