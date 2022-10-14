package exercicios;

/*Crie um programa que leia a idade e diga se é maior de idade ou não*/

import java.util.Scanner;

public class ExIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        if(idade >= 18 && idade < 120){
            System.out.println("Você é maior de idade");
        } else if(idade < 18 && idade > 0){
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Digite uma valor válido");
        }
    }
}
