import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a temperatura em Fahrenheit?");
        double tempFahrenheit = entrada.nextDouble();

        double tempCelsius = (tempFahrenheit -32) * 5 / 9;

        System.out.printf("%.2fº Celsius é o mesmo que %.2fº em Fahrenheit", tempFahrenheit, tempCelsius);
    }
}
