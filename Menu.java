package ecommerce;

import ecommerce.util.Cores;

import java.util.Scanner;

public class Menu {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {


            System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT = "\033[0;107m");
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
            System.out.println("********************************************************");
            System.out.println("                                               ");
            System.out.println(Cores.TEXT_PURPLE_BOLD);
            System.out.println("       SERENITY BY JAN | VELAS AROMÁTICAS      ");
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
            System.out.println("                                               ");
            System.out.println("********************************************************");
            System.out.println(Cores.TEXT_BLACK_BOLD);
            System.out.println("                                               ");
            System.out.println("    1 - Adicionar Produto ao Carrinho          ");
            System.out.println("    2 - Listar Produtos           	           ");
            System.out.println("    3 - Detalhes do Produto                    ");
            System.out.println("    4 - Remover produto do Carrinho            ");
            System.out.println("    5 - Finalizar Compra                       ");
            System.out.println("    6 - Sair      	                           ");
            System.out.println("                                               ");
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT);
            System.out.println("********************************************************");
            System.out.println(Cores.TEXT_BLACK_BOLD);
            System.out.println("                                               ");
            System.out.println("    Entre com a opção desejada:                ");
            System.out.println("                                               ");
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

                case 1 -> System.out.println("1 - Adicionar Produto ao Carrinho\n\n");

                case 2 -> System.out.println("2 - Listar Produtos\n\n");

                case 3 -> System.out.println("3 - Detalhes do Produto\n\n");

                case 4 -> System.out.println("4 - Remover produto do Carrinho\n\n");

                case 5 -> System.out.println("5 - Finalizar Compra\n\n");

                default -> System.out.println("Opção inválida! Tente novamente\n\n");

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

}