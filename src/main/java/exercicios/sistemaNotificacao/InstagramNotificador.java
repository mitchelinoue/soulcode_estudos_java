package exercicios.sistemaNotificacao;

public class InstagramNotificador implements Notificador{
    private String nomeUsuario;

    InstagramNotificador(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void notificar(String msg){
        System.out.println(msg + nomeUsuario);
    }

}
