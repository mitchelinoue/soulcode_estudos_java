import java.util.Scanner;

/*Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
        temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
        variável C é a temperatura em graus Celsius.*/
public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a temperatura em Fahrenheit?");
        double tempFahrenheit = entrada.nextDouble();

        double tempCelsius = (tempFahrenheit -32) * 5 / 9;

        System.out.printf("%.2fº Celsius é o mesmo que %.2fº em Fahrenheit", tempFahrenheit, tempCelsius);
    }
}
