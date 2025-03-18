package Condicoes;

import java.util.Scanner;

public class IFEElse {
    public static void main(String[] args) {

        /*
         * IF e ElSE - Condiçoes
         * else if
         * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         * */

        Scanner scanner = new Scanner(System.in);
        // Ninja naruto
        String rank;
        System.out.println("Digite o nome do seu ninja: ");
        String nome = scanner.next();


        System.out.println("Digite a idade do " + nome + ": ");
        int idade = scanner.nextInt();

        boolean hokage = false;

        System.out.println("Digite o número de missões do " + nome + ": ");
        short numeroDeMissoes = scanner.nextShort();


        /*
         * if ( condicao) { resultado }
         * else if ( condicao) { resultado }
         * else { resultado caso nada seja verdadeiro }
         * */

        //se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            rank = "Chunnin";
        } else if (numeroDeMissoes >= 20) {
            rank = "Jounin";
        } else {
            rank = "Gennim";
        }
        System.out.println(nome + " é um " + rank);

        scanner.close();
    }
}
