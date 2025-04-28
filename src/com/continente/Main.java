package com.continente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do continente: ");
        String nomeContinente = scanner.nextLine();
        Continente continente = new Continente(nomeContinente);

        System.out.println("Digite quantos paises tera o continente: ");
        int numerosDePaises = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numerosDePaises; i++) {
            System.out.print("Digite o nome do país: ");
            String nomePais = scanner.nextLine();

            System.out.print("Digite a população do país: ");
            int populacao = scanner.nextInt();

            System.out.print("Digite a área do país (em km²): ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            Pais novoPais = new Pais(nomePais, populacao, area);

            continente.adicionarPais(novoPais);
        }

        System.out.println("\n" + "Continente: " + continente.getNome());
        System.out.println("Dimensão total do Continente: " + continente.getTotalDimensaoContinente());
        System.out.println("\n");
        System.out.printf("Total População do Continente: %.2f", continente.getTotalPopulacaoContinente());
        System.out.println("\n");
        System.out.printf("Densidade populacional do Continente: %.2f", continente.getDensidadePopulacionalContinente());
        System.out.println("\n");
        System.out.printf("País com maior população: %s, %2d", continente.getPaisMaiorPopulacaoContinente().getNome(), continente.getPaisMaiorPopulacaoContinente().getPopulacao());
        System.out.println("\n");
        System.out.printf("País com menor população: %s, %2d", continente.getPaisMenorPopulacaoContinente().getNome(), continente.getPaisMenorPopulacaoContinente().getPopulacao());
        System.out.println("\n");
        System.out.printf("País com maior Dimensão: %s, %.2f", continente.getPaisMaiorDimensaoContinente().getNome(), continente.getPaisMaiorDimensaoContinente().getArea());
        System.out.println("\n");
        System.out.printf("País com menor Dimensão: %s, %.2f", continente.getPaisMenorDimensaoContinente().getNome(), continente.getPaisMenorDimensaoContinente().getArea());
        System.out.println("\n");
        System.out.printf("Razão territorial do maior País em relação ao menor país: %.2f", continente.getRazaoTerritorial());

    }
}