package exercicios.sistemaNotificacao;

public class EmailNotificador implements Notificador{
    private String email;

    EmailNotificador (String email){
        this.email = email;
    }

    @Override
    public void notificar(String msg){
        System.out.println(msg + email);
    }

}
