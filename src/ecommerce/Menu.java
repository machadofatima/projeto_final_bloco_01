package ecommerce;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Produto;
import ecommerce.model.Vela;
import ecommerce.util.Cores;

import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;


public class Menu {

    public static Scanner ler = new Scanner(System.in);

    public static ProdutoController controller= new ProdutoController();

    public static void main(String[] args) {


        // Teste da Classe Ecommerce
       Vela vela1 = new Vela(1, "Vela Lavander",100.00,5.0f, "Herbal");
       Vela vela2 = new Vela(2, "Vela Vanilla", 100.00,4.8f,"Gourmand");
       Vela vela3 = new Vela(3, "Vela Fig Leaf", 100.00,4.9f, "Frutal");
       Vela vela4 = new Vela(4, "Vela Cinnamon", 100.00,4.7f, "Herbal-Gourmand");
       Vela vela5 = new Vela(5, "Vela Cipreste | Especial de Natal", 150.00,5.0f, "Herbal");
       Vela vela6 = new Vela(6, "Vela Gingerbread | Especial de Natal", 150.00,4.9f,"Herbal-Gourmand");

        controller.cadastrar(vela1);
        controller.cadastrar(vela2);
        controller.cadastrar(vela3);
        controller.cadastrar(vela4);
        controller.cadastrar(vela5);
        controller.cadastrar(vela6);


        while (true) {


            System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT = "\033[0;107m");
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
            System.out.println("********************************************************");
            System.out.println("                                                        ");
            System.out.println(Cores.TEXT_PURPLE_BOLD);
            System.out.println("       SERENITY BY FATI | VELAS AROMÁTICAS              ");
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
            System.out.println("                                                        ");
            System.out.println("********************************************************");
            System.out.println(Cores.TEXT_BLACK_BOLD);
            System.out.println("                                                        ");
            System.out.println("    1 - Adicionar Produto ao Carrinho                   ");
            System.out.println("    2 - Mostrar Produtos no Carrinho                    ");
            System.out.println("    3 - Remover Produto do Carrinho                     ");
            System.out.println("    4 - Detalhes do Produto                             ");
            System.out.println("    5 - Finalizar Compra                                ");
            System.out.println("    6 - Sair      	                                    ");
            System.out.println("                                                        ");
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
            System.out.println("********************************************************");
            System.out.println(Cores.TEXT_BLACK_BOLD);
            System.out.println("                                                        ");
            System.out.println("    Entre com a opção desejada:                         ");
            System.out.println("                                                        ");
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
            System.out.println("********************************************************");
            System.out.println(Cores.TEXT_RESET);


            int opcao = ler.nextInt();

            if (opcao == 6) {
                System.out.println("\nSERENITY BY FATI | VELAS AROMÁTICAS | TAKE A CANDLE. LEAVE A CANDLE.");
                sobre();
                System.exit(0);

            }

            switch (opcao) {

                case 1 -> {
                    System.out.println("1 - Adicionar Produto ao Carrinho\n\n");
                    System.out.println("Digite o código do produto:");
                    int codigo = ler.nextInt();
                    Produto produto = controller.buscarProduto(codigo);
                    if(produto == null) {
                        System.out.println("\nProduto não encontrado");

                    }else {
                        controller.adicionarCarrinho(produto);
                    }
                    keyPress();
                }

                case 2 -> {
                    System.out.println("2 - Mostrar Produtos no Carrinho\n\n");
                    controller.listarProdutos();
                    keyPress();
                }

                case 3 -> {System.out.println("3 - Remover Produto do Carrinho\n\n");
                    System.out.println("Digite o código do produto:");
                    int codigo = ler.nextInt();
                    Produto produto = controller.buscarProduto(codigo);
                    if(produto == null) {
                        System.out.println("\nProduto não encontrado");

                    }else {
                        controller.deletar(produto.getCodigo());
                    }  keyPress();}

                case 4 -> {System.out.println("4 - Detalhes do Produto\n\n");
                    System.out.println("Digite o código do produto:");
                    int codigo = ler.nextInt();
                    Produto produto = controller.buscarProduto(codigo);
                    if(produto == null) {
                        System.out.println("\nProduto não encontrado");

                    }else {
                        Produto item = controller.buscarProduto(produto.getCodigo());
                        item.visualizar();
                    }
                keyPress();}

                case 5 -> {System.out.println("5 - Finalizar Compra\n\n");
                    Double totalDaCompra = controller.totalDaCompra();
                    System.out.println("Compra finalizada com sucesso! Total da compra: " + totalDaCompra);

                keyPress();}

                default -> {System.out.println("Opção inválida! Tente novamente\n\n");
                keyPress();}

            }

        }

    }

    public static void sobre() {
        System.out.println(Cores.TEXT_WHITE_BOLD);
        System.out.println("***********************************************************");
        System.out.println("Projeto Desenvolvido por: Fátima Machado :) ");
        System.out.println("Generation Brasil - generation@generation.org");
        System.out.println("https://github.com/machadofatima/projeto_final_bloco_01.git");
        System.out.println("***********************************************************");

    }

    public static void keyPress() {

        try {
            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de Enter!");
        }

    }


}