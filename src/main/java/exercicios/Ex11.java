import java.util.Scanner;

/*Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.*/
public class Ex11 {
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
