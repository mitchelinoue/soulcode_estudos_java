package exercicios;

/*cria um programa java que lê N e depois N valores armazenado no array, em seguida retorna a soma total e a média dos valores*/

import java.util.Scanner;

public class ExArraySomaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o tamanho da lista de números inteiros?");
        int tamanho = entrada.nextInt();

        int[] lista = new int[tamanho];

        for(int i = 0; i < tamanho ; i++){
            System.out.println("Digite o " + (i+1) + "º número da lista");
            lista[i] = entrada.nextInt();
        }

        double soma = 0;

        for( int num : lista){
            soma += num;
        }

        System.out.println("A soma dos números da lista é de: " + soma + " e a média é de: " + (soma/tamanho));


    }
}
