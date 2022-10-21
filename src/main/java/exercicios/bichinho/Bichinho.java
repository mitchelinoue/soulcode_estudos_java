package exercicios.bichinho;

import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private boolean estaDormindo;
    private ArrayList<Comida> bucho = new ArrayList<Comida>();

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return  this.idade;
    }
    public double getPeso(){
        return this.peso;
    }

    public boolean getEstaDormindo(){
        return this.estaDormindo;
    }

    public ArrayList<Comida> getBucho(){
        return this.bucho;
    }

    Bichinho(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = new ArrayList<>();
        this.estaDormindo = false;
    }

    public void comer(Comida comida){
        if(bucho.size() - 1 > 0 && bucho.get(bucho.size() - 1) == comida){
            System.out.println(this.nome + " acabou de comer e não quer mais " + comida.getNome());
        }else if(this.estaDormindo == true){
            System.out.println(this.nome + " está dormindo");
        } else {
            this.bucho.add(comida);
            this.peso += comida.getPeso();
            System.out.println(this.nome + " comeu " + comida.getNome());
        }

    }

    public void dormir(int horas){ //supondo que ele perde 10% do peso por hora
        if(this.estaDormindo == true){
            System.out.println(this.nome + " já está dormindo");
        } else if( this.peso < 1){
            System.out.println(this.nome + " não pode dormir e precisa comer mais!");
        } else {
            for (int i = 0; i < horas; i++ ){
                this.peso = this.peso * 0.9;
            }
            System.out.println(this.nome + "dormiu por " + horas + " horas e agora pesa " + this.peso);
        }
    }

    public void acordar(){
        if(estaDormindo == true){
            estaDormindo = false;
        }
    }

}
