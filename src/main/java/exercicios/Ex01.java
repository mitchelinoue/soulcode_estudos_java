package exercicios;

import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Qual a quantidade mínima do produto?");
    int quantidadeMin = entrada.nextInt();

    System.out.println("Qual a quantidade máxima do produto?");
    int quantidadeMax = entrada.nextInt();

    double media = (quantidadeMin + quantidadeMax) / 2;

    System.out.println("O estoque médio é de: " + media);



    }
}
