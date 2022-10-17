package aulas.poo;

public class Pessoa {
    //Propriedade/atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    //construtor da classe
    Pessoa() {
        this.nome = "José"; //this representa o objeto
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55;
        this.altura = 1.65;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }


    //ações de uma pessoa(método)
    //<tipo_retorno> nomeDoMetodo(PARAMETROS){}
    void dizOla(){
        System.out.println("Olá, tudo bem? Meu nome é " + this.nome );
    }

    void mostraImc(){
         double imc = this.peso / (this.altura*this.altura);
        System.out.println("O meu IMC é: " + imc);
    }

    double calculaImc(){
        double imc = this.peso / (this.altura*this.altura);
        return imc;
    }

    void comer(String comida){
        System.out.println("Olá, sou " + this.nome + " e estou comendo " + comida);
    }

}
