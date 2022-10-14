package aulas;

import java.util.Scanner;

public class EstudoArray {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4}; //possui tamanho fixo
        System.out.println(numeros.length); //tamanho do array
        numeros[3] = 1000;
        System.out.println(numeros[3]);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }


        int[] numeros2 = new int[50]; //do 0...50
        numeros2[0] = 500;
        numeros[1] = -200;
        // ...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"José Almir", "Renato Pereira", "Victor Icoma"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        /*int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];*/


        // Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt(); //5

        double[] notasProva = new double[totalNotas]; //0...4

        for(int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da nota: ");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota : notasProva) {
            System.out.println(nota);
            soma += nota;
        }

        double media = soma / notasProva.length;


        //condição ternária
        String mensagem = (media < 7) ? "você está reprovado" : "você está aprovado";

        System.out.println("Sua média é: " + media + " e " + mensagem);


        //Default values
        int numero; //padrão = 0
        double nota2; //padrão = 0.0
        long populacao; // padrão = 0
        boolean teste; // padrão = false
        String nome; // padrão = null (ausência de objeto na variável)

        //wrapper classes
        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long op2 = 1l;
        Boolean teste2 = false;

    }
}
