package Desafios;

public class PrimeiroDesafio {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'S';

        if(idade < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Não concluida, idade insuficiente" ;
            }
        } else {
            statusDaMissao = "Concluida";
        }

        System.out.println("------------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da Missao: " + nivelDaMissao);
        System.out.println("Status da Missão: " + statusDaMissao);

        System.out.println("------------------------------------------------");

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 9;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        if (idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Missao concluida";
            } else {
                statusDaMissao2 = "Missao nao concluida, voce é muito novo";
            }
        } else {
            statusDaMissao2 = "Missao concluida, voce é maior de idade";
        }

        System.out.println("------------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status da Missao: " + statusDaMissao2);
        System.out.println("Nivel da Missao: " + nivelDaMissao2);

        System.out.println("------------------------------------------------");

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 20;
        String missao3 = "Curar Feridos da guerra";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3 = 'D';

        System.out.println("------------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Status da Missao: " + statusDaMissao3);
        System.out.println("Nivel da Missao: " + nivelDaMissao3);

        System.out.println("------------------------------------------------");


    }
}
