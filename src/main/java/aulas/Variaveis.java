package aulas;

public class Variaveis {
    // Execução do nosso programa JAVA
    public static void main(String[] args) {
        System.out.println("Hello,world!"); //equivale ao console.log()

        //Variáveis no JAVA
        //fortemente tipado e estaticamente tipado
        int idade = 20; //int => número inteiro
        double salario = 4500.99; //double => dupla precisão(casa decimal)
        float nota = 7.5f; //f => sufixo para float (ñ é muito utilizado)
        long populacaoTerra = 7_900_000_000l; //long = para números acima de 2Bil (precisa do sufixo l)
        boolean tarefaConcluida = true;
        int i = 1, j = 0, k = 1000; //múltiplas variáveis ao msm tempo
        String nomeCompleto = "Mitchel Inoue";

        int teste = 10;
        teste = 9; // reatribuição de variáveis

        final int teste2 = 200; // impossível mudar o valor


        //Operadores
        int a = 10;
        int b = 5;

        int soma = a + b; //15
        int subtracao = a - b; //5
        int multiplicacao = a * b; //50
        int divisao = a / b; //2

        System.out.println(("O resultado da some é " + soma));


        // A divisão entre dois inteiros resulta em inteiro
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;

        double resultado = sete / dois;
        System.out.println(resultado); //3

        double resutado2 = sete / dois2;
        System.out.println((resutado2)); //3.5

        // Math
        double x = Math.sqrt(144); // raiz quadrada 12
        double y = Math.pow(5, 2); // potência 25
        System.out.println(Math.PI);


        //casting
        int pi2 = (int)Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; //transforma para double uma int 3.5


        //Operadores 2
        int valor = 5;
        valor++; // incremento +1
        valor--; // incremento -1
        valor += 10; //valor = valor + 10

        System.out.println("O valor é " + valor);

        //Operadores relacionais
        boolean test1 = 5 > 1; //true
        boolean test2 = 5 < 1; //false
        boolean test3 = 5 == 5; //true
        boolean test4 = 5 != 1; //true
        boolean test5 = 6 >= 6; //true
        boolean test6 = 5 <= 9; //true


        //operadores lógicos
        boolean test8 = true && false; //false
        boolean test9 = true || false; //true
        boolean test10 = (5 > 10) && (10 < 5); //false
        boolean test11 = (10 >= 0) || (1 < 5); //true
        boolean test12 = (5 > 1); //true
        boolean test13 = !test12; //false
        boolean test14 = !test13; //true

        System.out.println(test14);
    }
}

