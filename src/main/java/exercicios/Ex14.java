import java.util.Scanner;

/*Escreva um programa que leia dois números e apresente a diferença do maior para o menor.*/
public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor inteiro de A?");
        double valorA = entrada.nextDouble();

        System.out.println("Qual o valor inteiro de B?");
        double valorB = entrada.nextDouble();

        if (valorA > valorB){
            double diferenca = valorA - valorB;
            System.out.printf("A diferença entre %.0f e %.0f é de %.0f", valorA, valorB, diferenca);
        } else if (valorA < valorB){
            double diferenca = valorB - valorA;
            System.out.printf("A diferença entre %.0f e %.0f é de %.0f", valorB, valorA, diferenca);
        } else {
            System.out.println("Os valores são iguais");
        }




    }
}
