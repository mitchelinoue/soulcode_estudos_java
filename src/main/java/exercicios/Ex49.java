package exercicios;

/*Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas mesmas posições.*/

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um tamanho: ");
        int tamanho = entrada.nextInt();
        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("Digite os valores de v1: ");
        for(int i = 0; i < tamanho; i++){
            v1[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores de v2: ");
        for(int i = 0; i < tamanho; i++){
            v2[i] = entrada.nextInt();
        }

        int valoresIguais = 0;
        for (int i = 0; i < tamanho; i++) {
            if(v1[i] == v2[i]){
                System.out.println("O Valor " + v1[i] + " está na posição " + i + " e é igual em v1 e v2");
                valoresIguais++;
            }
        }

        System.out.println("Foram encontrados " + valoresIguais + " valores iguais.");

    }
}
