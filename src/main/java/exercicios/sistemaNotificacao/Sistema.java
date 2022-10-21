package exercicios.sistemaNotificacao;

public class Sistema {
   public Notificador notificador;

   Sistema(Notificador notificador){
       this.notificador = notificador;
   }

    public void alertaSistema(){
       EmailNotificador.notificar("alerta");
       TelefoneNotificador.notificar("alerta");
       InstagramNotificador.notificar("alerta");
   }

   public void sobrecargaSistema(){
       EmailNotificador.notificar("alerta");
       TelefoneNotificador.notificar("alerta");
       InstagramNotificador.notificar("alerta");
   }

}
