import java.util.Scanner;

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
