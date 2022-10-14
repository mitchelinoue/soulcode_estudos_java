import java.util.Scanner;

/*Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
        valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
        A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
        com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
        devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
        multiplicações.*/

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o primeiro valor inteiro?");
        int valor1 = entrada.nextInt();

        System.out.println("Qual o segundo valor inteiro?");
        int valor2 = entrada.nextInt();

        System.out.println("Qual o terceiro valor inteiro?");
        int valor3 = entrada.nextInt();

        System.out.println("Qual o quarto valor inteiro?");
        int valor4 = entrada.nextInt();

        System.out.println("O valor da soma de " + valor1 + " e " + valor2 + " é igual a: " + (valor1 + valor2));
        System.out.println("O valor da multiplicação de " + valor1 + " e " + valor2 + " é igual a: " + (valor1 * valor2));
        System.out.println("O valor da soma de " + valor1 + " e " + valor3 + " é igual a: " + (valor1 + valor3));
        System.out.println("O valor da multiplicação de " + valor1 + " e " + valor3 + " é igual a: " + (valor1 * valor3));
        System.out.println("O valor da soma de " + valor1 + " e " + valor4 + " é igual a: " + (valor1 + valor4));
        System.out.println("O valor da multiplicação de " + valor1 + " e " + valor4 + " é igual a: " + (valor1 * valor4));
        System.out.println("O valor da soma de " + valor2 + " e " + valor3 + " é igual a: " + (valor2 + valor3));
        System.out.println("O valor da multiplicação de " + valor2 + " e " + valor3 + " é igual a: " + (valor2 * valor3));
        System.out.println("O valor da soma de " + valor2 + " e " + valor4 + " é igual a: " + (valor2 + valor4));
        System.out.println("O valor da multiplicação de " + valor2 + " e " + valor4 + " é igual a: " + (valor2 * valor4));
        System.out.println("O valor da soma de " + valor3 + " e " + valor4 + " é igual a: " + (valor3 + valor4));
        System.out.println("O valor da multiplicação de " + valor3 + " e " + valor4 + " é igual a: " + (valor3 * valor4));



    }
}
