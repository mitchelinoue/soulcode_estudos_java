package exercicios;

/*Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
        1 – Adição
        2 – Subtração
        3 – Multiplicação
        4 – Divisão*/

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma opção (1 a 4)");
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor");
        double valor2 = entrada.nextDouble();

        switch (opcao) {
            case 1 -> {
                double resp = valor1 + valor2;
                System.out.println("A resposta é: " + resp);
            }
            case 2 -> {
                double resp = valor1 - valor2;
                System.out.println("A resposta é: " + resp);
            }
            case 3 -> {
                double resp = valor1 * valor2;
                System.out.println("A resposta é: " + resp);
            }
            case 4 -> {
                double resp = valor1 / valor2;
                System.out.println("A resposta é: " + resp);
            }
        }
    }
}
