package Desafios.Terceiro;
import  Desafios.Facilities;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ninja> ninjas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); // Único Scanner

        int choice;

        do {
            // Usando o método da classe Desafios.Facilities
            choice = Facilities.validarNum(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do seu ninja: ");
                    String name = scanner.nextLine();

                    System.out.print("Digite a idade do seu ninja: ");
                    int age = Facilities.validarNum(scanner); // Reutilizando o método

                    System.out.print("Digite a missão do seu ninja: ");
                    String mission = scanner.nextLine();

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

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Digite um número válido (1-3)!");
            }
        } while (choice != 3);

        scanner.close();
    }
}