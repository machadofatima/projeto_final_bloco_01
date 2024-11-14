package ecommerce.repository;

import ecommerce.model.Produto;

import java.math.BigDecimal;

public interface ProdutoRepository {

        // Métodos CRUD do E-Commerce (Create, Read, Update e Delete)

        public Produto buscarProduto(int codigo);
        public void listarProdutos();
        public void cadastrar(Produto codigo);
        public void adicionarCarrinho(Produto produto);

        public void atualizar(Produto codigo);

        public Double totalDaCompra();
        public void deletar(int codigo);

}
