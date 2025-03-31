package Desafios.Terceiro;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ninja> ninjas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Digite 1 para criar um ninja\n2 - para mostrar os dados de um ninja\n3 - para sair ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do seu ninja: ");
                    String name = scanner.next();

                    System.out.print("Digite a idade do seu ninja: ");
                    int age = scanner.nextInt();

                    System.out.print("Digite a missão do seu ninja: ");
                    String mission = scanner.next();

                    Ninja ninja = new Ninja(age, name, mission, "em andamento");
                    ninjas.add(ninja);

                    break;

                case 2:
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum ninja foi criado ainda.");
                    } else {
                        System.out.println("Lista de ninjas:");
                        for (int i = 0; i < ninjas.size(); i++) {
                            System.out.println("Ninja " + (i + 1) + ":");
                            ninjas.get(i).mostrarInformacoes();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                default:
                    System.out.println("Digite um Número válido!");

            }

        } while (choice != 3);
        scanner.close();
    }
}
