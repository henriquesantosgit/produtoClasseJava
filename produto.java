package br.edu.fatecpg.produto.model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

  
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;  
        this.preco = preco; 
        this.quantidadeEstoque = quantidadeEstoque; 
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Erro: A quantidade em estoque não pode ser negativa.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque + " unidades");
    }
}
