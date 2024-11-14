package ecommerce.controller;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
    private ArrayList<Produto> listaCarrinho = new ArrayList<Produto>();


    @Override
    public Produto buscarProduto(int codigo) {
        AtomicReference<Produto> result = new AtomicReference<>();
        listaProduto.forEach(item -> {
            if(item.getCodigo() == codigo) {
                result.set(item);
            }
        });
        return result.get();
    }

    @Override
    public void listarProdutos() {
        for (var produto : listaCarrinho) {
            produto.visualizar();
        }

    }

    @Override
    public void cadastrar(Produto produto) {
    listaProduto.add(produto);
    }

    @Override
    public void adicionarCarrinho(Produto produto) {
        listaCarrinho.add(produto);
        System.out.println("\nProduto " + produto.getProduto() + " adicionado ao carrinho!");
    }

    public Produto buscarNaCollection(int codigo) {
        AtomicReference<Produto> result = null;
        listaProduto.forEach(item -> {
        if(item.getCodigo() == codigo) {
            result.set(item);
        }
        });
        return result.get();

    }

    @Override
    public void atualizar(Produto produto) {
        var buscarProduto = buscarNaCollection(produto.getCodigo());

        if(buscarProduto != null) {
            listaProduto.set(listaProduto.indexOf(buscarProduto), produto);
            System.out.println("\nProduto " + produto.getProduto() + "atualizado com sucesso!");

        }else
            System.out.println("\nProduto " + produto.getProduto() + "não encontrado!");

    }


    public Double totalDaCompra() {
    AtomicReference<Double> total = new AtomicReference<>(0.d);
        listaCarrinho.forEach(item -> {
            total.set( total.get()+(item.getPreco()));
        });
        return total.get();
    }




    @Override
    public void deletar(int codigo) {
        Produto produto = null;
        for (var item : listaCarrinho) {
        if(codigo == item.getCodigo()) {
            produto = item;

        }
        }
        boolean result = listaCarrinho.remove(produto);
        if(result){
            System.out.println("Produto "+ produto + "excluído do carrinho!");
        }else {
            System.out.println("Produto não encontrado");
        }

    }
}