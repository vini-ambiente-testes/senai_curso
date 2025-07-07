package com.caixa_mercado;

import java.util.Scanner;
import java.util.ArrayList;

class Produtos{
    String nome;
    double preco;

    Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    void apresentar() {
        System.out.println("Olá, seu produto é " + nome + " e vale " + preco + " reais");
    }

}

public class Produto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        System.out.println("Me fale o nome do item?");
        String nome=leitura.next();
        System.out.println("Me fale o preço do item?");
        double preco = leitura.nextDouble();
        listaProdutos.add(new Produtos(nome, preco));
        for (Produtos p : listaProdutos) {
            p.apresentar();
        }
    }

}