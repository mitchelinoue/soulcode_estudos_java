import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean igual = false, naoIgual = false, maior = false, menor = false, maiorIgual = false, menorIgual = false;

        System.out.println("Qual o primeiro número inteiro?");
        int valor1 = entrada.nextInt();

        System.out.println("Qual o segundo número inteiro?");
        int valor2 = entrada.nextInt();

        if(valor1 == valor2) igual = true;
        if(valor1 != valor2) naoIgual = true;
        if(valor1 > valor2) maior = true;
        if(valor1 < valor2) menor = true;
        if(valor1 >= valor2) maiorIgual = true;
        if(valor1 <= valor2) menorIgual = true;

        System.out.printf("\n%d é igual a %d? " + igual, valor1, valor2);
        System.out.printf("\n%d é diferente de %d? " + naoIgual, valor1, valor2);
        System.out.printf("\n%d é maior que %d? "+ maior, valor1, valor2);
        System.out.printf("\n%d é menor que %d? " + menor, valor1, valor2);
        System.out.printf("\n%d é maior ou igual a %d? " + maiorIgual, valor1, valor2);
        System.out.printf("\n%d é menor ou igual a %d? " + menorIgual, valor1, valor2);
    }
}
