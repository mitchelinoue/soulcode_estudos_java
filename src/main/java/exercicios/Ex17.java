package exercicios;

/*Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
        entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
        Caso contrário, apresentar a mensagem “valor inválido”.*/

import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = entrada.nextInt();

        if(valor >= 0 && valor <= 9){
            System.out.println("Valor entre 0 e 9 e é válido");
        } else {
            System.out.println("Valor fora da faixa de 0 a 9 e é inválido");
        }
    }
}
