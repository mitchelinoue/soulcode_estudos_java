package aulas.poo;

public class Pet {
    private String nome;
    private int idade;
    protected double peso;
    //private = nas subclasses o atributo/metodo private não é acessível
    //protected = permite acesso direto nas subclasses

    public Pet(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom(){
        System.out.println("...");
    }

    public void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }

    public void dormir(){
        System.out.println("zzzzzzzzzzz");
    }

    public void brincar (){
        System.out.println("Estou brincando...");
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double novoPeso){ //possibilita da alterar o peso
        this.peso = novoPeso;
    }
    //pet.peso = 10
    //pet.setPeso(12)



    public int getidade() {
        return this.idade;
    }
    public void getIdade(int novoIdade) {
        this.idade = novoIdade;
    }

    public String getNome() {
        return this.nome;
    }
    public void getNome(String novoNome) {
        this.nome = novoNome;
    }


}
