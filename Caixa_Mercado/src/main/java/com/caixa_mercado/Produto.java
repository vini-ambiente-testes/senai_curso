package com.caixa_mercado;

import java.util.Scanner;

// Definindo uma classe Pessoa
public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void apresentar() {
        System.out.println("O nome do produto é " + this.nome + " e valor é " + this.preco + " reais.");
}
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        do{
            System.out.println("Me fale o nome do item?");
            String nome=leitura.next();
            System.out.println("Me fale o preço do item?");
            double preco = leitura.nextDouble();
            Produto produto = new Produto(nome, preco);
            produto.apresentar();
        }while();
    }
}