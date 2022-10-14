import java.util.Scanner;

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
