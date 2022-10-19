package exercicios.bichinho;

public class BichinhoTeste {
    public static void main(String[] args) {

        Bichinho bichinho1 = new Bichinho("pou", 2, 17.5);
        Comida comida1 = new Comida("morango", 1);
        Comida comida2 = new Comida("abacaxi", 3);

        bichinho1.comer(comida1);
        bichinho1.comer(comida2);
        bichinho1.comer(comida2);

        System.out.println(bichinho1.getPeso());

        bichinho1.dormir(10);
        System.out.println(bichinho1.getPeso());



    }
}
