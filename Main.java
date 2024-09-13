package br.edu.fatecpg.produto.view;

import java.util.Scanner;
import br.edu.fatecpg.produto.model.Produto;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

       
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        
        System.out.println("Digite a quantidade em estoque:");
        int quantidadeEstoque = scanner.nextInt();

        
        Produto produto = new Produto(nome, preco, quantidadeEstoque);

       
        System.out.println("\nProduto criado com sucesso:");
        produto.exibirDetalhes();  

       
    }
}
