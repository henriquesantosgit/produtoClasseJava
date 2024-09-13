package br.edu.fatecpg.produto.view;

import br.edu.fatecpg.produto.model.Produto;

public class Main {

    public static void main(String[] args) {
        // Criação de um objeto Produto
        Produto produto1 = new Produto("Caneta", 2.50, 100);

        // Exibindo os detalhes do produto
        System.out.println(produto1);

        // Tentando definir um preço negativo
        System.out.println("\nTentando definir preço negativo:");
        produto1.setPreco(-5.00);

        // Tentando definir uma quantidade de estoque negativa
        System.out.println("\nTentando definir estoque negativo:");
        produto1.setQuantidadeEstoque(-10);

        // Definindo um preço válido
        System.out.println("\nDefinindo preço válido:");
        produto1.setPreco(3.00);
        System.out.println(produto1);

        // Definindo uma quantidade de estoque válida
        System.out.println("\nDefinindo estoque válido:");
        produto1.setQuantidadeEstoque(200);
        System.out.println(produto1);
    }
}
