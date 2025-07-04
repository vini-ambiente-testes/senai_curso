package com.caixa_mercado; // Certifique-se que o pacote aqui corresponde ao PACKAGE_BASE


public class Carrinho {
    public static void Adicao() {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        Carrinho myObj = new Carrinho();
        Adicao();
    }
}
public class Carrinho {
    private double largura;
    private double altura;

    public Carrinho(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public String Adicao() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Carrinho compras= new Carrinho();

    }
}

