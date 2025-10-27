package principal;

public class Temperatura {

   
    private double celsius;

    // 🔹 Construtor 
    public Temperatura(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("A temperatura não pode ser menor que -273.15°C (zero absoluto)!");
        }
        this.celsius = celsius;
    }

    public double paraFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }


    public double paraKelvin() {
        return celsius + 273.15;
    }


    public static void main(String[] args) {

    
        Temperatura t1 = new Temperatura(25.0);

     
        System.out.println("Temperatura em Celsius: " + t1.celsius + "°C");
        System.out.println("Em Fahrenheit: " + String.format("%.2f", t1.paraFahrenheit()) + "°F");
        System.out.println("Em Kelvin: " + String.format("%.2f", t1.paraKelvin()) + " K");
    }
}
