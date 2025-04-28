package com.continente;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public Pais getPais(int pais){
       return paises.get(pais);
    }

    public double getTotalDimensaoContinente() {
        double dimensao = 0;
        for (Pais pais : paises) {
            dimensao += pais.getArea();
        }
        return dimensao;
    }

    public double getTotalPopulacaoContinente() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    public double getDensidadePopulacionalContinente() {
        return getTotalPopulacaoContinente() / getTotalDimensaoContinente();
    }

    public Pais getPaisMaiorPopulacaoContinente() {
        Pais maior = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maior.getPopulacao()) {
                maior = pais;
            }
        }
        return maior;
    }

    public Pais getPaisMenorPopulacaoContinente() {
        Pais menor = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menor.getPopulacao()) {
                menor = pais;
            }
        }
        return menor;
    }


    public Pais getPaisMaiorDimensaoContinente() {
        Pais maior = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getArea() > maior.getArea()) {
                maior = pais;
            }
        }
        return maior;
    }

    public Pais getPaisMenorDimensaoContinente() {
        Pais menor = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getArea() < menor.getArea()) {
                menor = pais;
            }
        }
        return menor;
    }

    public double getRazaoTerritorial() {
        Pais maior = getPaisMaiorDimensaoContinente();
        Pais menor = getPaisMenorDimensaoContinente();
        return maior.getArea() / menor.getArea();
    }

    public String getNome() {
        return this.nome;
    }
}
