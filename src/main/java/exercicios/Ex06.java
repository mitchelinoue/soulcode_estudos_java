import java.util.Scanner;

/*Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
        temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
        Fahrenheit e a variável C representa é a temperatura em graus Celsius.*/
public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius?");
        double tempCelsius = entrada.nextDouble();

        double tempFahrenheit = (9 * tempCelsius + 160) / 5;

        System.out.printf("%.2fº Celsius é o mesmo que %.2fº em Fahrenheit", tempCelsius, tempFahrenheit);
    }
}
