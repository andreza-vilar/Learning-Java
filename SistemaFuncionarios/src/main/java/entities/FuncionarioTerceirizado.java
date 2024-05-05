package entities;

public class FuncionarioTerceirizado extends Funcionario {

    private Double custoAdicional;

    public FuncionarioTerceirizado(){
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double custoAdicional) {
        super(nome, horas, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + this.custoAdicional * 1.1;
    }

}
