package aulas.poo;

import java.time.LocalDate;


//Encapsulamento - escolhe quais atributos/metodos serão visiveis fora da classe
//public(padrão) => visível para todos
// private => os métodos/atributos são visíveis apenas na classe
// protected => bem parecido com o private

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Felipe", "José", LocalDate.of(1993,5,25), 1.85, 95);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
    }


}
