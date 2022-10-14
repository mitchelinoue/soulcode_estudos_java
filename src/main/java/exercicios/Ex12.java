import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor inteiro?");
        int valor = entrada.nextInt();

        if(valor > 0){
            System.out.printf("O modulo de %d é igual a %d", valor, valor);
        } else {
            int modulo = valor * -1;
            System.out.printf("O modulo de %d é igual a %d", valor, modulo);
        }




    }
}
