package Desafios;

import java.util.Scanner;

public class Facilities {
    public static int validarNum(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Digite sua opção: ");
                int numero = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
                return numero;
            } catch (Exception error) {
                System.out.println("Por favor, digite apenas números.");
                scanner.nextLine(); // Limpa a entrada inválida
            }
        }
    }
}