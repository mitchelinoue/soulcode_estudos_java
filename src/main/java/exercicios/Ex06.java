import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius?");
        double tempCelsius = entrada.nextDouble();

        double tempFahrenheit = (9 * tempCelsius + 160) / 5;

        System.out.printf("%.2fº Celsius é o mesmo que %.2fº em Fahrenheit", tempCelsius, tempFahrenheit);
    }
}
