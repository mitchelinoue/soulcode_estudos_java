package exercicios;

/*Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
        menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.*/

import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro: ");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int valor2 = entrada.nextInt();

        if(valor1 > valor2){
            System.out.println(valor1 + " é maior que " + valor2);
        } else if(valor1 < valor2){
            System.out.println(valor2 + " é maior que " + valor1);
        } else {
            System.out.println("Os valores são iguais.");
        }
    }
}
