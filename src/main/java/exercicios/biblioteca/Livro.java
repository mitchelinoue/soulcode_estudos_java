package exercicios.biblioteca;
/*Crie uma classe Livro que possui:
        Atributos: nome, autor, preco;
        Construtores:
        - Cria livros com base nos parâmetros nome, autor (objeto da classe Autor), preco;*/

import java.util.ArrayList;

public class Livro{

    private String nome;
    private Autor autor; //informações do Autor(objeto) | não é hereditariedade, é composição
    private double preco;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;

    }

    @Override //serve para ver os atributos do objetos no printLn
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor=" + autor +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {
        Autor jk = new Autor("JK", "jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra Filosofal ", jk, 24.90);

        System.out.println(pedraFilosofal.autor.getEmail());

        Livro camaraSecreta = jk.escreverLivro("Harry Potter e a Câmara Secreta", 30.00);

        Livro prisioneiroAzk = jk.escreverLivro("Harry Potter e o Prisioneiro de Azkaban", 40.00);


        ArrayList<Livro> livrosJK = new ArrayList<>();
        livrosJK.add(pedraFilosofal);
        livrosJK.add(camaraSecreta);
        livrosJK.add(prisioneiroAzk);

        System.out.println(livrosJK);

    }
}
