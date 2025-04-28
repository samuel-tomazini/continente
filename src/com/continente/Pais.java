package com.continente;

class Pais {
    private String nome;
    private int populacao;
    private double area;

    public Pais(String nome, int populacao, double area) {
        this.nome = nome;
        this.populacao = populacao;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public double getArea() {
        return area;
    }
}