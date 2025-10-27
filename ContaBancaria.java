package principal;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Erro: titular inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro: saldo não pode ser negativo!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: saque inválido ou saldo insuficiente!");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Luiz", 1000);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000); // aqui vai dar erro 

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
