import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
        pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/
public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        int anos = entrada.nextInt();

        System.out.println("Quantos meses inteiros se passaram desde seu último aniversário (do dia do seu aniversário até o mesmo dia do mês seguinte?");
        int meses = entrada.nextInt();

        System.out.println("Quantos dias se passaram desde a última vez que o número do dia do seu aniversário passou mais recente?");
        int dias = entrada.nextInt();

        int total = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem " + total + " dias de vida!");
    }
}
