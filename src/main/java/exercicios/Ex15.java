import java.util.Scanner;

/*Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
        aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
        do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
        apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
        apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
        aluno.*/
public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor inteiro de A?");
        int valorA = entrada.nextInt();

        System.out.println("Qual o valor inteiro de B?");
        int valorB = entrada.nextInt();

        int valorC = valorB;
        valorB = valorA;
        valorA = valorC;

        System.out.printf("Agora A vale %d e B vale %d", valorA, valorB);


    }
}
