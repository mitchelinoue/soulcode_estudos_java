import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor inteiro de A?");
        int a = entrada.nextInt();

        System.out.println("Qual o valor inteiro de B?");
        int b = entrada.nextInt();

        System.out.println("Qual o valor inteiro de C?");
        int c = entrada.nextInt();

        if(a >= b && a >= c && b >= c){
            System.out.printf("A ordem decrescente é: %d - %d - %d", c, b, a);
        } else if(a <= b && a <= c && b <= c){
            System.out.printf("A ordem decrescente é: %d - %d - %d", a, b, c);
        } else if(a <= b && a <= c && b >= c){
            System.out.printf("A ordem decrescente é: %d - %d - %d", a, c, b);
        } else if(a <= b && a >= c && b >= c) {
            System.out.printf("A ordem decrescente é: %d - %d - %d", c, a, b);
        }else if(a >= b && a >= c && b <= c) {
            System.out.printf("A ordem decrescente é: %d - %d - %d", b, c, a);
        }else if(a >= b && a <= c && b <= c) {
            System.out.printf("A ordem decrescente é: %d - %d - %d", b, a, c);
        }
    }
}
