package exercicios;

/*Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou
        igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é
        um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou
        seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).*/

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int CODIGO = entrada.nextInt();

        if(CODIGO == 1 || CODIGO == 2 || CODIGO == 3){

        }


    }
}
