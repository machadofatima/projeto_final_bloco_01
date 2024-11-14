package ecommerce.model;

import java.math.BigDecimal;

public class Vela extends Produto {

private String aroma;

public Vela(int codigo, String produto, Double preco, float avaliacao, String aroma) {
    super(codigo, produto, preco, avaliacao);
    this.aroma = aroma;

}

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public void visualizar() {
    super.visualizar();
    System.out.println("Aroma: " + aroma);

    }



}
