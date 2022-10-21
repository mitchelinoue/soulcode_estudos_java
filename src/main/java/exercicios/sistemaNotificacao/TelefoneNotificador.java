package exercicios.sistemaNotificacao;

public class TelefoneNotificador implements Notificador {

    private String numero;

    TelefoneNotificador(String numero){
        this.numero = numero;
    }

    @Override
    public void notificar(String msg){
        System.out.println(msg + numero);
    }

}
