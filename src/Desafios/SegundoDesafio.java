package Desafios;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        String[] ninjasCadastrados = new String[10];
        int contadorNinjas = 0;

        while (running) {

            System.out.println("Bem-vindo ao cadastrador de Ninjas!");
            System.out.println("Por favor, selecione uma das opções abaixo:\n");
            System.out.println("1 - Cadastrar um ninja");
            System.out.println("2 - Visualizar ninjas cadastrados");
            System.out.println("3 - Sair da aplicação\n");

            System.out.print("Digite a sua escolha: ");
            int opcoes = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha após o número

            switch (opcoes) {
                case 1:
                    if (contadorNinjas < ninjasCadastrados.length) {
                        System.out.print("Digite o nome do ninja que deseja cadastrar: ");
                        String novoNinja = scanner.nextLine();

                        ninjasCadastrados[contadorNinjas] = novoNinja;
                        contadorNinjas++;

                        System.out.println("O ninja " + novoNinja + " foi cadastrado com sucesso!");
                    } else {
                        System.out.println("O limite de ninjas cadastrados foi atingido!");
                    }
                    break;

                case 2:
                    System.out.println("Ninjas cadastrados:");
                    if (contadorNinjas == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        for (int i = 0; i < contadorNinjas; i++) {
                            System.out.println((i + 1) + ". " + ninjasCadastrados[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo da aplicação...");
                    running = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("\nPressione Enter para continuar...");
            scanner.nextLine(); // Aguarda o usuário pressionar Enter
            ClearConsole.clearConsole(); // Limpa o console
        }

        scanner.close(); // Fecha o scanner para evitar vazamento de memória
    }
}
