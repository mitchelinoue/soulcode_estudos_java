package aulas.poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtPortas;
    double combustivelAtual;
    double consumo;
    boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0; //todos os carros começam com 30 litros
        this.consumo = consumo;
        this.estaLigado = false; //todos os carros começam desligados
    }

    //Abastecer
    void abastecer(double total){
        this.combustivelAtual += total;
    }

    //Ligar
    void ligar(){
        this.estaLigado = true;
    }
    //Desligar

    void desligar(){
        this.estaLigado = false;
    }
    //Viajar

    boolean viajar(String local, double distancia){
        if(!this.estaLigado){
            this.ligar();
        }

        //calcula quantos litros serão necessários para a viagem
        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu e sobrou " + this.combustivelAtual + " litros de gasolina");
            return true; //a viagem aconteceu
        } else {
            System.out.println("A viagem não aconteceu, falta gasolina");
            return false; //a viagem não será possível
        }
    }


    //A main para testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("xy", "Ferrari", 2019, true, 4, 40);
        Carro carro2 = new Carro("z", "Ford", 2000, false, 2, 50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano);
        carro1.ano = 2022;
        System.out.println(carro1.ano);

        boolean viajou = carro1.viajar("Fortaleza", 300);
        System.out.println(viajou);


    }

}



