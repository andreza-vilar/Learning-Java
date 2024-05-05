package entities;

public class ProdutoImportado extends Produto {

    private Double custoAlfandega;

    public ProdutoImportado(String nome, Double preco, Double custoAlfandefa) {
        super(nome, preco);
        this.custoAlfandega = custoAlfandega;
    }

    public Double getCustoAlfandega() {
        return custoAlfandega;
    }

    public void setCustoAlfandega(Double custoAlfandega) {
        this.custoAlfandega = custoAlfandega;
    }

    public Double precoTotal(){
        return getPreco() + custoAlfandega;
    }


    @Override
    public String priceTag() {
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (Customs fee: $ "
                + String.format("%.2f", custoAlfandega)
                + ")";
    }
}
