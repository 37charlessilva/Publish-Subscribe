public class AppResponsavel implements Subscriber {
    public void receberMensagem(String topico, String mensagem) {
        System.out.println("[Responsável] Notificação recebida: " + mensagem);
    }
}
