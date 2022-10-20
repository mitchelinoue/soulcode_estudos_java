package aulas.poo.zoo;

//Na interface você define um conjunto de métodos (sem corpo)
//E a classe que "herda" deve implementar estes métodos
public interface Animal {
    void dormir(); //definção do método apenas
    void fazerSom();
    void comer(String comida);
}

//Gato precisa implementar os métodos
class Gato implements Animal{
    @Override
    public void dormir() {
        System.out.println("zzzzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")){
            System.out.println("Hummm gosto de peixe");
        } else {
            System.out.println("Só como peixe");
        }
    }

    public void ronronar(){
        System.out.println("Grrrrmm");
    }
}
class Galinha implements Animal{
    @Override
    public void dormir(){
        System.out.println("Có có có zzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummmm có có " + comida);
    }

    public void botarOvo(){
        System.out.println("ovo colocado");
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");
        galinha.botarOvo();

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");
        gato.ronronar();

        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new Gato();
        System.out.println(" ======Polimorfismo===== ");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();
    }
}


