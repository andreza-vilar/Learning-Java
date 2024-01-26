package entities;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;


    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    
    public Conta(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setNomeTitular(String nome){
        this.nomeTitular = nome;
    }

    public void depositar(double quantia){
        this.saldo += quantia;
    }

    public void sacar(double quantia){
        this.saldo -= quantia + 5;
    }

    public String toString() {
        return "Conta "
                + numeroConta
                + ", Titular: "
                + nomeTitular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }

}
