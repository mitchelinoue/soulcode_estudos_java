import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos minutos foram gastos na viagem?");
        double tempo = entrada.nextInt();

        System.out.println("Qual foi a velocidade(km/h) média durante a viagem?");
        double velocidade = entrada.nextInt();

        double distancia = (tempo / 60) * velocidade;

        double combustivelUsado = distancia / 12;

        System.out.printf("Com uma velocidade média de %.2fkm/h e tempo gasto de %.2f minutos, percorremos uma distância de %.2f km e consumimos %.2f litros de gasolina", velocidade, tempo, distancia, combustivelUsado);
    }
}
