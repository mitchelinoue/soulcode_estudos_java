package aulas.poo;

public class Calculadora {


    //atríbuto  estático (?global?)
    //final = impede a alteração do valor de PI
    public static final double PI = 3.14;

    //método estático não pertence ao objeto, mas sim a classe

    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtração(double a, double b){
        return a - b;
    }

    public static double multiplicação(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }




    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSub = Calculadora.subtração(1, 2);
        double resultadoMult = Calculadora.multiplicação(1, 2);
        double resultadoDivi = Calculadora.divisao(1, 2);
        System.out.println(Calculadora.PI);
        System.out.println(Math.PI);

    }




}
