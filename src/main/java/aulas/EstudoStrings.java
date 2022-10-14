package aulas;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        // string são cadeias de caracteres
        // José -> J = 0, o = 1, s = 2, é = 3

        String nome = "Pedro";

        if(nome == "Pedro"){
            System.out.println("São iguais");
        }


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu sobrenome (Pereira)");
        String sobrenome = entrada.nextLine();

        if(sobrenome == "Pereira"){ // Não vai dar certo pois compara posição dos valores na variável
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        if(sobrenome.equals("Pereira")){ //dá certo pois compara o valor dos valores na variável
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        sobrenome.equalsIgnoreCase("pereira"); // compara sem maiúscula

        //Outros métodos
        String java = "Java";
        String ja = java.substring(0, 2); //salva do índice 0 até o 1 (exclui 2) e exclui o resto
        String va = java.substring(2); //salva do índice 2 até o final do valor

        System.out.println(ja);
        System.out.println(va);


        String m1 = "Hello, ";
        String m2 = "World!";
        String m3 = m1.concat(m2); //igual a m1 + m2

        System.out.println(m3);

        System.out.println(m3.length()); //quantos caracteres a string possui
        System.out.println(java.isEmpty()); //verifica se está vazia => "" (false significa que ñ está)
        System.out.println(m3.toUpperCase()); //transforma em maiúsculo
        System.out.println(m3.toLowerCase()); //transforma em minúsculo

        String data = "13/10/2022";
        String[] valores = data.split("/"); //vai virar ["13", "10", "2022"]

        System.out.println(valores[0]);

        String email = "jose.almir@gmail.com";
        String[] valoresEmail = email.split("@"); //["jose.almir", "gmail.com"]
        System.out.println(valoresEmail[0]);

        String nome2 = "José Silva";
        String[] nomeSeparado = nome2.split(" ");
        System.out.println(nomeSeparado[0]);

        String teste = "Amanhã é sexta!";
        String[] teste2 = teste.split(""); //separa cada caracter do string em um array
        System.out.println(Arrays.toString(teste2)); //Array.toString serve para mostrar exatamente esse método de mostrar a string em um array

    }
}
