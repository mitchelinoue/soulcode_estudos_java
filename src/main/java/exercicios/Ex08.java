import java.util.Scanner;

/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
        V = 3.14159 * R * R * A
        Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.*/
public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o raio da lata em cm?");
        double raio = entrada.nextDouble();

        System.out.println("Qual o altura da lata em cm?");
        double altura = entrada.nextDouble();

        double volumeCm3 = 3.1415 * Math.sqrt(raio) * altura;
        double volumeLitros = volumeCm3 * 0.001;

        System.out.printf("O volume da lata é de %.2f cm³ ou %.2f litros", volumeCm3, volumeLitros);
    }
}

