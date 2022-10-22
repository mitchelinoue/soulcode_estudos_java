package exercicios.sistemaNotificacao;

public interface Notificador {
    void notificar(String msg);

}

class EmailNotificador implements Notificador{
    public String email;

    EmailNotificador (String email){
        this.email = email;
    }

    @Override
    public void notificar(String msg){
        System.out.println(msg + email);
    }

}

class TelefoneNotificador implements Notificador {

    public String numero;

    TelefoneNotificador(String numero){
        this.numero = numero;
    }

    @Override
    public void notificar(String msg){
        System.out.println(msg + numero);
    }

}

class InstagramNotificador implements Notificador{
    public String nomeUsuario;

    InstagramNotificador(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void notificar(String msg){
        System.out.println(msg + nomeUsuario);
    }

}

class Sistema {
    public Notificador notificador;

    Sistema(Notificador notificador){
        this.notificador = notificador;
    }

    public void alertaSistema(){
        notificador.notificar("alerta ");
    }

    public void sobrecargaSistema(){
        notificador.notificar("sobrecarga ");
    }


    public static void main(String[] args) {


        EmailNotificador n1 = new EmailNotificador("mitchel_inoue");
        TelefoneNotificador n2 = new TelefoneNotificador("123456");
        InstagramNotificador n3 = new InstagramNotificador("mitchel");

        Sistema n4 = new Sistema(n1);
        Sistema n5 = new Sistema(n2);
        Sistema n6 = new Sistema(n3);

        n1.notificar("n1 ");
        n2.notificar("n2 ");
        n3.notificar("n3 ");

        n4.alertaSistema();
        n5.alertaSistema();
        n6.alertaSistema();
        n4.sobrecargaSistema();
        n5.sobrecargaSistema();
        n6.sobrecargaSistema();




    }

}
