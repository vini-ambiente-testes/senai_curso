package com.caixa_mercado;

import java.util.Scanner;
import java.util.ArrayList;

class Produto{
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    void apresentar() {
        System.out.println("Olá, seu produto é " + nome + " e vale " + preco + " reais");
    }

}

public class Produtos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        System.out.println("Me fale o nome do item?");
        String nome=leitura.next();
        System.out.println("Me fale o preço do item?");
        double preco = leitura.nextDouble();
        listaProdutos.add(new Produto(nome, preco));
        for (Produto p : listaProdutos) {
            p.apresentar();
        }
    }

}