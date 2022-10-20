package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", "carlos.jose@gmail.com", "123456789-10", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("João Pedro", "joao@gmail.com", "987654321-01", "T.I.");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Maria Antonia", "mari@gmail.com", "132789456-50");
        p1.seApresentar();

        System.out.println("=====================================================");
        //Aluno é uma Pessoa
        Pessoa p2 = new Aluno("José", "jose@gmail.com", "321456789-10", 8.4);
        //Professor é uma Pessoa
        Pessoa p3 = new Professor("Pedro", "pedro@gmail.com", "789654321-01", "Engenharia");

        p2.seApresentar();
        p3.seApresentar();


        //Polimorfismo
        System.out.println("=========Pessoas=========");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for(Pessoa pessoa : pessoas){
            //o método seApresentar() se comporta diferente dependendo da classe original
            pessoa.seApresentar();
        }




    }
}
