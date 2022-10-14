package exercicios;

/*Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
ocorrência.*/

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor do primeiro lado do triângulo?");
        int v1 = entrada.nextInt();

        System.out.println("Qual o valor do segundo lado do triângulo?");
        int v2 = entrada.nextInt();

        System.out.println("Qual o valor do terceiro lado do triângulo?");
        int v3 = entrada.nextInt();

        if(v1 + v2 > v3 || v1 + v3 > v2 || v2 + v3 > v1){
            if(v1 == v2 && v2 == v3){
                System.out.println("O triângulo é equilátero");
            } else if(v1 == v2 || v1 == v3 || v2 == v3){
                System.out.println("O triângulo é isósceles");
            } else{
                System.out.println("O triângulo é escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
