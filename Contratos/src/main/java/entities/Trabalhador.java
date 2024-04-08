package entities;

import entities.enums.classificacaoTrabalho;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private classificacaoTrabalho classificacao;
    private Double salarioBase;

    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, classificacaoTrabalho classificacao, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public classificacaoTrabalho getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(classificacaoTrabalho classificacao) {
        this.classificacao = classificacao;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }

    public void addContrato(HoraContrato contrato) {
        this.contratos.add(contrato);
    }

    public void removeContrato(HoraContrato contrato) {
        this.contratos.remove(contrato);
    }

    public double calculaRenda(int ano, int mes) {
        double soma = salarioBase;
        Calendar calendar = Calendar.getInstance();

        for (HoraContrato contrato : contratos) {
            calendar.setTime(contrato.getData());
            int calendarioAno = calendar.get(Calendar.YEAR);
            int calendarioMes = 1 + calendar.get(Calendar.MONTH);
            if (ano == calendarioAno && mes == calendarioMes) {
                soma += contrato.valorTotal();
            }

        }

        return soma;
    }

}

