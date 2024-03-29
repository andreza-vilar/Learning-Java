package entities;

public class Funcionario {
    private String nome;
    private int ID;
    private double salario;


    public Funcionario(String nome, int ID, double salario){
        this.nome = nome;
        this.salario = salario;
        this.ID = ID;
    }


    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void aumento(double porcentagem){
        salario += salario * porcentagem / 100;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return ID + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
