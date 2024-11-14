package ecommerce.model;

import ecommerce.util.Cores;

import java.math.BigDecimal;

public abstract class Produto {

    private int codigo;
    private String produto;
    private Double preco;
    private String tipo;
    private float avaliacao;


    public Produto(int codigo, String produto, Double preco, float avaliacao) {
        this.codigo = codigo;
        this.produto = produto;
        this.preco = preco;
        this.avaliacao = avaliacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }




    public void visualizar() {
        System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
        System.out.println("***********************************************");
        System.out.println(Cores.TEXT_BLACK_BOLD_BRIGHT);
        System.out.println("Código: " + codigo);
        System.out.println("Produto: " + produto);
        System.out.println("Preço: " + preco);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
        System.out.println("***********************************************");

    }

    @Override
    public String toString() {
        return "Produto " + produto;
    }
}