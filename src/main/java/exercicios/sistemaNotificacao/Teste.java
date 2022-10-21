package exercicios.sistemaNotificacao;

public class Teste {
    public static void main(String[] args) {


        EmailNotificador n1 = new EmailNotificador("mitchel_inoue");
        TelefoneNotificador n2 = new TelefoneNotificador("123456");
        InstagramNotificador n3 = new InstagramNotificador("mitchel");

        n1.notificar("alerta");

       /* Notificador s1 = new Sistema();*/


    }
}
