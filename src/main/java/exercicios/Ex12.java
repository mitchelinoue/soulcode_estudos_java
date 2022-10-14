import java.util.Scanner;

/*Escreva um programa que leia um número inteiro e exiba o seu módulo.
        O módulo de um número x é:
        x se x é maior ou igual a zero
        x * (-1) se x é menor que zero*/

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor inteiro?");
        int valor = entrada.nextInt();

        if(valor > 0){
            System.out.printf("O modulo de %d é igual a %d", valor, valor);
        } else {
            int modulo = valor * -1;
            System.out.printf("O modulo de %d é igual a %d", valor, modulo);
        }




    }
}
