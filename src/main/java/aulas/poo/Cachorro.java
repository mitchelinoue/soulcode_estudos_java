package aulas.poo;

import com.sun.security.jgss.GSSUtil;

public class Cachorro extends Pet{

    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
        super(nome, idade, peso); // representa a classe Pet, chamando o construtor da classe pai/superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override //anotação = vamos sobrescrever a ação fazer som
    public void fazerSom() {
        System.out.println("Au auuu");
    }

    @Override
    public void brincar(){
        this.fazerSom();//chama o fazerSom do Cachorro, foi sobrescrito
        super.brincar(); // chama o brincar de Pet
        this.dormir(); // chama o dormir do Pet, pois não foi sobrescrito
    }

    @Override
    public void comer(String comida){
        if(comida.equals(this.comidaFavorita)){
            super.comer(comida); //chama o comer do pet
            this.setPeso(this.getPeso() + 0.2); // se super.peso for private use esse
            this.peso += 0.2; //se super.peso for protected use esse
        } else {
            System.out.println("Quero " + comida + " não!");
        }
    }

    public void correrAtrasMoto(){
        this.fazerSom();
        System.out.println("Correndo atrás da moto");
    }

    public static void main(String[] args) {
        //testar herança

        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();

        System.out.println(" ================================== ");

        Cachorro batata = new Cachorro("Rex", 5, 25, "Osso","Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);



    }


}
