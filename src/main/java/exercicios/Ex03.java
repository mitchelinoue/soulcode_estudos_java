import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o nome do vendedor?");
        String nomeVendedor = entrada.nextLine();

        System.out.println("Qual o código da peça?");
        String codigoPeca = entrada.nextLine();

        System.out.println("Qual o preço da peça " + codigoPeca + "?");
        double precoPeca = entrada.nextDouble();

        System.out.println("Qual a quantidade vendida de peça " + codigoPeca + "?");
        int quantidadeVendida = entrada.nextInt();

        double comissao = (quantidadeVendida * precoPeca) * 0.05;

        System.out.printf("A comissão do vendedor %s será de: R$ %.2f", nomeVendedor, comissao);

    }
}
